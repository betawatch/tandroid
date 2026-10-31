package x9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import c3.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import z9.o0;
import z9.p0;
import z9.u0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final v b;
    public final a c;
    public final n4.q d;
    public final ea.d e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        i0.o(5, hashMap, "armeabi", 6, "armeabi-v7a");
        i0.o(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, v vVar, a aVar, n4.q qVar, ea.d dVar) {
        this.a = context;
        this.b = vVar;
        this.c = aVar;
        this.d = qVar;
        this.e = dVar;
    }

    public static p0 c(ji.f fVar, int i10) {
        String str = (String) fVar.c;
        String str2 = (String) fVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) fVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ji.f fVar2 = (ji.f) fVar.e;
        if (i10 >= 8) {
            ji.f fVar3 = fVar2;
            while (fVar3 != null) {
                fVar3 = (ji.f) fVar3.e;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        p0 p0Var = null;
        if (fVar2 != null && i12 == 0) {
            p0Var = c(fVar2, i10 + 1);
        }
        return new p0(str, str2, d, p0Var, i12);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            bh.d dVar = new bh.d();
            dVar.e = Integer.valueOf(i10);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            dVar.a = Long.valueOf(max);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            dVar.b = str;
            dVar.c = fileName;
            dVar.d = Long.valueOf(j10);
            arrayList.add(dVar.m());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, aVar.b, 0L, 0L));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u0 b(int i10) {
        boolean z10;
        Float f7;
        long j10;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        int i11 = 2;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e) {
            e = e;
            z10 = false;
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z10 = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e7) {
                e = e7;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f7 = null;
                if (f7 != null) {
                }
                if (z10) {
                }
                i11 = 1;
                if (h.g()) {
                }
                long b10 = h.b(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j10 = b10 - memoryInfo.availMem;
                if (j10 <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                j2.f fVar = new j2.f();
                fVar.a = r4;
                fVar.b = Integer.valueOf(i11);
                fVar.c = Boolean.valueOf(r2);
                fVar.d = Integer.valueOf(i10);
                fVar.e = Long.valueOf(j10);
                fVar.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return fVar.i();
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f7 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f7 != null ? Double.valueOf(f7.doubleValue()) : null;
                if (z10 || f7 == null) {
                    i11 = 1;
                } else if (f7.floatValue() >= 0.99d) {
                    i11 = 3;
                }
                boolean z11 = h.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
                long b102 = h.b(context);
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                j10 = b102 - memoryInfo2.availMem;
                if (j10 <= 0) {
                    j10 = 0;
                }
                long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                j2.f fVar2 = new j2.f();
                fVar2.a = valueOf;
                fVar2.b = Integer.valueOf(i11);
                fVar2.c = Boolean.valueOf(z11);
                fVar2.d = Integer.valueOf(i10);
                fVar2.e = Long.valueOf(j10);
                fVar2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
                return fVar2.i();
            }
        } else {
            z10 = false;
        }
        f7 = null;
        if (f7 != null) {
        }
        if (z10) {
        }
        i11 = 1;
        if (h.g()) {
        }
        long b1022 = h.b(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j10 = b1022 - memoryInfo22.availMem;
        if (j10 <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        j2.f fVar22 = new j2.f();
        fVar22.a = valueOf;
        fVar22.b = Integer.valueOf(i11);
        fVar22.c = Boolean.valueOf(z11);
        fVar22.d = Integer.valueOf(i10);
        fVar22.e = Long.valueOf(j10);
        fVar22.f = Long.valueOf((r3.getBlockCount() * blockSize22) - (blockSize22 * r3.getAvailableBlocks()));
        return fVar22.i();
    }
}
