package x9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.internal.play_billing.k3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import z9.o0;
import z9.p0;
import z9.u0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class q {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final v b;
    public final a c;
    public final qf.b d;
    public final ea.b e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        k3.n(5, hashMap, "armeabi", 6, "armeabi-v7a");
        k3.n(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, v vVar, a aVar, qf.b bVar, ea.b bVar2) {
        this.a = context;
        this.b = vVar;
        this.c = aVar;
        this.d = bVar;
        this.e = bVar2;
    }

    public static p0 c(com.google.firebase.messaging.s sVar, int i10) {
        String str = (String) sVar.c;
        String str2 = (String) sVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) sVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (com.google.firebase.messaging.s) sVar3.e;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        p0 p0Var = null;
        if (sVar2 != null && i12 == 0) {
            p0Var = c(sVar2, i10 + 1);
        }
        return new p0(str, str2, d, p0Var, i12);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            z5 z5Var = new z5();
            z5Var.e = Integer.valueOf(i10);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            z5Var.b = Long.valueOf(max);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            z5Var.a = str;
            z5Var.c = fileName;
            z5Var.d = Long.valueOf(j10);
            arrayList.add(z5Var.k());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.b));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
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
                com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                mVar.a = r4;
                mVar.b = Integer.valueOf(i11);
                mVar.c = Boolean.valueOf(r2);
                mVar.d = Integer.valueOf(i10);
                mVar.e = Long.valueOf(j10);
                mVar.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return mVar.j();
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
                com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                mVar2.a = valueOf;
                mVar2.b = Integer.valueOf(i11);
                mVar2.c = Boolean.valueOf(z11);
                mVar2.d = Integer.valueOf(i10);
                mVar2.e = Long.valueOf(j10);
                mVar2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
                return mVar2.j();
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
        com.google.firebase.messaging.m mVar22 = new com.google.firebase.messaging.m();
        mVar22.a = valueOf;
        mVar22.b = Integer.valueOf(i11);
        mVar22.c = Boolean.valueOf(z11);
        mVar22.d = Integer.valueOf(i10);
        mVar22.e = Long.valueOf(j10);
        mVar22.f = Long.valueOf((r3.getBlockCount() * blockSize22) - (blockSize22 * r3.getAvailableBlocks()));
        return mVar22.j();
    }
}
