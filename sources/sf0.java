// default package

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sf0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[LOOP:0: B:11:0x0076->B:13:0x007a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sf0(String str, char[] cArr, byte[] bArr, boolean z) {
        int i;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (dp5.a[roundingMode2.ordinal()]) {
                    case 1:
                        ioe.b((length > 0) & (((length + (-1)) & length) == 0));
                    case 2:
                    case 3:
                        i = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        i = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                        i = (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - length))) >>> 31);
                        break;
                    default:
                        wn4.f();
                        break;
                }
                this.d = i;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                int i2 = 1 << (3 - numberOfTrailingZeros);
                this.e = i2;
                this.f = i >> numberOfTrailingZeros;
                this.c = cArr.length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.f; i3++) {
                    int i4 = this.d;
                    RoundingMode roundingMode3 = RoundingMode.CEILING;
                    zArr[cle.b(i3 << 3, i4)] = true;
                }
                this.h = z;
            }
            w26.j(tb4.n(length, "x (", ") must be > 0"));
            i = 0;
            this.d = i;
            int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i);
            int i22 = 1 << (3 - numberOfTrailingZeros2);
            this.e = i22;
            this.f = i >> numberOfTrailingZeros2;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr2 = new boolean[i22];
            while (i3 < this.f) {
            }
            this.h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sf0)) {
            return false;
        }
        sf0 sf0Var = (sf0) obj;
        return this.h == sf0Var.h && Arrays.equals(this.b, sf0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sf0(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                w26.j(nue.a("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
            if (!(bArr[c] == -1)) {
                w26.j(nue.a("Duplicate character: %s", Character.valueOf(c)));
                throw null;
            }
            bArr[c] = (byte) i;
        }
    }
}
