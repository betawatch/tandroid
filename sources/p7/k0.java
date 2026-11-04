package p7;

import java.math.RoundingMode;
import java.util.Arrays;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < cArr.length; i3++) {
            char c2 = cArr[i3];
            if (!(c2 < 128)) {
                throw new IllegalArgumentException(a.c("Non-ASCII character: %s", Character.valueOf(c2)));
            }
            if (!(bArr[c2] == -1)) {
                throw new IllegalArgumentException(a.c("Duplicate character: %s", Character.valueOf(c2)));
            }
            bArr[c2] = (byte) i3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.h == k0Var.h && Arrays.equals(this.b, k0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[LOOP:0: B:13:0x005d->B:15:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        int i3;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (o0.a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.d = numberOfLeadingZeros;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i10 = 1 << (3 - numberOfTrailingZeros);
                        this.e = i10;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros;
                        this.c = length - 1;
                        this.g = bArr;
                        boolean[] zArr = new boolean[i10];
                        for (i3 = 0; i3 < this.f; i3++) {
                            int i11 = this.d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[a.a(i3 * 8, i11)] = true;
                        }
                        this.h = z10;
                        return;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.d = numberOfLeadingZeros;
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i102 = 1 << (3 - numberOfTrailingZeros2);
                        this.e = i102;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                        this.c = length - 1;
                        this.g = bArr;
                        boolean[] zArr2 = new boolean[i102];
                        while (i3 < this.f) {
                        }
                        this.h = z10;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        this.d = numberOfLeadingZeros;
                        int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i1022 = 1 << (3 - numberOfTrailingZeros22);
                        this.e = i1022;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                        this.c = length - 1;
                        this.g = bArr;
                        boolean[] zArr22 = new boolean[i1022];
                        while (i3 < this.f) {
                        }
                        this.h = z10;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(p1.i(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
