// default package

import android.os.SystemClock;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class pq3 {
    public static double a;
    public static long b;
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];

    public static final int a(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int b(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static synchronized long c() {
        synchronized (pq3.class) {
            if (b == 0 || SystemClock.elapsedRealtime() - b > 60000) {
                return la3.d(a.b).b();
            }
            return (long) a;
        }
    }

    public static boolean d() {
        return c() >= 3000000;
    }
}
