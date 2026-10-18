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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class p {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final u b;
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

    public p(Context context, u uVar, a aVar, qf.b bVar, ea.b bVar2) {
        this.a = context;
        this.b = uVar;
        this.c = aVar;
        this.d = bVar;
        this.e = bVar2;
    }

    public static p0 c(com.google.firebase.messaging.r rVar, int i10) {
        String str = (String) rVar.c;
        String str2 = (String) rVar.b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) rVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.r rVar3 = rVar2;
            while (rVar3 != null) {
                rVar3 = (com.google.firebase.messaging.r) rVar3.e;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        p0 p0Var = null;
        if (rVar2 != null && i12 == 0) {
            p0Var = c(rVar2, i10 + 1);
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
            arrayList.add(z5Var.p());
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
                com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
                lVar.a = r4;
                lVar.b = Integer.valueOf(i11);
                lVar.c = Boolean.valueOf(r2);
                lVar.d = Integer.valueOf(i10);
                lVar.e = Long.valueOf(j10);
                lVar.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return lVar.l();
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
                com.google.firebase.messaging.l lVar2 = new com.google.firebase.messaging.l();
                lVar2.a = valueOf;
                lVar2.b = Integer.valueOf(i11);
                lVar2.c = Boolean.valueOf(z11);
                lVar2.d = Integer.valueOf(i10);
                lVar2.e = Long.valueOf(j10);
                lVar2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
                return lVar2.l();
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
        com.google.firebase.messaging.l lVar22 = new com.google.firebase.messaging.l();
        lVar22.a = valueOf;
        lVar22.b = Integer.valueOf(i11);
        lVar22.c = Boolean.valueOf(z11);
        lVar22.d = Integer.valueOf(i10);
        lVar22.e = Long.valueOf(j10);
        lVar22.f = Long.valueOf((r3.getBlockCount() * blockSize22) - (blockSize22 * r3.getAvailableBlocks()));
        return lVar22.l();
    }
}
