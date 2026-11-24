// default package

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t03 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final vl5 b;
    public final ds c;
    public final mj4 d;
    public final ex8 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        aq1.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        aq1.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public t03(Context context, vl5 vl5Var, ds dsVar, mj4 mj4Var, ex8 ex8Var) {
        this.a = context;
        this.b = vl5Var;
        this.c = dsVar;
        this.d = mj4Var;
        this.e = ex8Var;
    }

    public static w90 c(e7a e7aVar, int i) {
        String str = (String) e7aVar.b;
        String str2 = (String) e7aVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e7aVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e7a e7aVar2 = (e7a) e7aVar.d;
        if (i >= 8) {
            e7a e7aVar3 = e7aVar2;
            while (e7aVar3 != null) {
                e7aVar3 = (e7a) e7aVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            gxc.d("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        w90 c = (e7aVar2 == null || i3 != 0) ? null : c(e7aVar2, i + 1);
        if (b == 1) {
            return new w90(str, str2, d, c, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            z90 z90Var = new z90();
            z90Var.e = i;
            z90Var.f = (byte) (z90Var.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            z90Var.a = max;
            byte b = (byte) (z90Var.f | 1);
            z90Var.b = str;
            z90Var.c = fileName;
            z90Var.d = j;
            z90Var.f = (byte) (b | 2);
            arrayList.add(z90Var.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static x90 e() {
        return new x90(0L, "0", "0");
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        ds dsVar = this.c;
        String str = dsVar.e;
        if (str == null) {
            gxc.d("Null name");
            return null;
        }
        String str2 = dsVar.b;
        if (b == 3) {
            return Collections.singletonList(new v90(str, str2, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final da0 b(int i) {
        boolean z;
        Float f2;
        long j;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z2 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e) {
            e = e;
            z = false;
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e2) {
                e = e2;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f2 = null;
                if (f2 != null) {
                }
                if (z) {
                }
                if (!bo2.h()) {
                }
                long a = bo2.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = a - memoryInfo.availMem;
                if (j <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                ca0 ca0Var = new ca0();
                ca0Var.a = r5;
                ca0Var.b = r0;
                byte b = (byte) (ca0Var.g | 1);
                ca0Var.c = z2;
                ca0Var.d = i;
                ca0Var.e = j;
                ca0Var.f = (r6.getBlockCount() * blockSize) - (blockSize * r6.getAvailableBlocks());
                ca0Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return ca0Var.a();
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f2 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                int i2 = (z || f2 == null) ? 1 : ((double) f2.floatValue()) < 0.99d ? 2 : 3;
                if (!bo2.h() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long a2 = bo2.a(context);
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                j = a2 - memoryInfo2.availMem;
                if (j <= 0) {
                    j = 0;
                }
                long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                ca0 ca0Var2 = new ca0();
                ca0Var2.a = valueOf;
                ca0Var2.b = i2;
                byte b2 = (byte) (ca0Var2.g | 1);
                ca0Var2.c = z2;
                ca0Var2.d = i;
                ca0Var2.e = j;
                ca0Var2.f = (r6.getBlockCount() * blockSize2) - (blockSize2 * r6.getAvailableBlocks());
                ca0Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                return ca0Var2.a();
            }
        } else {
            z = false;
        }
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        if (!bo2.h()) {
            z2 = true;
        }
        long a22 = bo2.a(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j = a22 - memoryInfo22.availMem;
        if (j <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        ca0 ca0Var22 = new ca0();
        ca0Var22.a = valueOf;
        ca0Var22.b = i2;
        byte b22 = (byte) (ca0Var22.g | 1);
        ca0Var22.c = z2;
        ca0Var22.d = i;
        ca0Var22.e = j;
        ca0Var22.f = (r6.getBlockCount() * blockSize22) - (blockSize22 * r6.getAvailableBlocks());
        ca0Var22.g = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return ca0Var22.a();
    }
}
