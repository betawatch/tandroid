package y9;

import a8.me;
import aa.b0;
import aa.m0;
import aa.q0;
import aa.r0;
import aa.w0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import c3.h0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final v b;
    public final a c;
    public final rf.b d;
    public final b0 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        h0.o(5, hashMap, "armeabi", 6, "armeabi-v7a");
        h0.o(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, v vVar, a aVar, rf.b bVar, b0 b0Var) {
        this.a = context;
        this.b = vVar;
        this.c = aVar;
        this.d = bVar;
        this.e = b0Var;
    }

    public static r0 c(com.google.firebase.messaging.q qVar, int i10) {
        String str = (String) qVar.b;
        String str2 = (String) qVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) qVar.c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.q qVar2 = (com.google.firebase.messaging.q) qVar.d;
        if (i10 >= 8) {
            com.google.firebase.messaging.q qVar3 = qVar2;
            while (qVar3 != null) {
                qVar3 = (com.google.firebase.messaging.q) qVar3.d;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        r0 r0Var = null;
        if (qVar2 != null && i12 == 0) {
            r0Var = c(qVar2, i10 + 1);
        }
        return new r0(str, str2, d, r0Var, i12);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            me meVar = new me();
            meVar.e = Integer.valueOf(i10);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            meVar.a = Long.valueOf(max);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            meVar.b = str;
            meVar.c = fileName;
            meVar.d = Long.valueOf(j10);
            arrayList.add(meVar.r());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new q0(str, 0L, 0L, aVar.b));
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
    public final w0 b(int i10) {
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
            } catch (IllegalStateException e10) {
                e = e10;
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
                m0 m0Var = new m0();
                m0Var.b = r4;
                m0Var.c = Integer.valueOf(i11);
                m0Var.d = Boolean.valueOf(r2);
                m0Var.e = Integer.valueOf(i10);
                m0Var.a = Long.valueOf(j10);
                m0Var.f = Long.valueOf((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
                return m0Var.g();
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
                m0 m0Var2 = new m0();
                m0Var2.b = valueOf;
                m0Var2.c = Integer.valueOf(i11);
                m0Var2.d = Boolean.valueOf(z11);
                m0Var2.e = Integer.valueOf(i10);
                m0Var2.a = Long.valueOf(j10);
                m0Var2.f = Long.valueOf((r3.getBlockCount() * blockSize2) - (blockSize2 * r3.getAvailableBlocks()));
                return m0Var2.g();
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
        m0 m0Var22 = new m0();
        m0Var22.b = valueOf;
        m0Var22.c = Integer.valueOf(i11);
        m0Var22.d = Boolean.valueOf(z11);
        m0Var22.e = Integer.valueOf(i10);
        m0Var22.a = Long.valueOf(j10);
        m0Var22.f = Long.valueOf((r3.getBlockCount() * blockSize22) - (blockSize22 * r3.getAvailableBlocks()));
        return m0Var22.g();
    }
}
