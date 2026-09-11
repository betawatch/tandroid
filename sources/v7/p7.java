package v7;

import java.math.RoundingMode;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class p7 {
    public static long a(long j3, long j10) {
        long j11 = j3 + j10;
        if (((j3 ^ j10) < 0) || ((j3 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException(a4.a.r(a4.a.t(j3, "overflow: checkedAdd(", ", "), j10, ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(long j3, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j3 / j10;
        long j12 = j3 - (j10 * j11);
        if (j12 != 0) {
            int i10 = ((int) ((j3 ^ j10) >> 63)) | 1;
            switch (g9.e.a[roundingMode.ordinal()]) {
                case 1:
                    if (j12 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case 3:
                    break;
                case 4:
                    return j11 + i10;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long abs = Math.abs(j12);
                    long abs2 = abs - (Math.abs(j10) - abs);
                    return abs2 != 0 ? j11 : j11;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static long c(long j3, long j10) {
        q7.a(j3, "a");
        q7.a(j10, "b");
        if (j3 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j3;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long j11 = j3 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j3, long j10) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (numberOfLeadingZeros > 65) {
            return j3 * j10;
        }
        long j11 = ((j3 ^ j10) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j3 < 0)))) {
            long j12 = j3 * j10;
            if (j3 == 0 || j12 / j3 == j10) {
                return j12;
            }
        }
        return j11;
    }
}
