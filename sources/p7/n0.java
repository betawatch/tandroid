package p7;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class n0 {
    public static final l0 d;
    public final k0 a;
    public final Character b;
    public volatile n0 c;

    static {
        new m0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new m0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new n0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new n0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new l0(new k0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public n0(k0 k0Var, Character ch2) {
        this.a = k0Var;
        if (ch2 != null) {
            byte[] bArr = k0Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        a.m(0, i3, bArr.length);
        while (i10 < i3) {
            k0 k0Var = this.a;
            b(sb2, bArr, i10, Math.min(k0Var.f, i3 - i10));
            i10 += k0Var.f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i3, int i10) {
        a.m(i3, i3 + i10, bArr.length);
        k0 k0Var = this.a;
        int i11 = k0Var.f;
        int i12 = k0Var.d;
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int i13 = 0;
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j10 = (j10 | (bArr[i3 + i14] & 255)) << 8;
        }
        int i15 = (i10 + 1) * 8;
        while (i13 < i10 * 8) {
            sb2.append(k0Var.b[((int) (j10 >>> ((i15 - i12) - i13))) & k0Var.c]);
            i13 += i12;
        }
        if (this.b != null) {
            while (i13 < k0Var.f * 8) {
                sb2.append('=');
                i13 += i12;
            }
        }
    }

    public final String c(int i3, byte[] bArr) {
        a.m(0, i3, bArr.length);
        k0 k0Var = this.a;
        int i10 = k0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(k0Var.e * a.a(i3, i10));
        try {
            a(sb2, bArr, i3);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.a.equals(n0Var.a) && Objects.equals(this.b, n0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        k0 k0Var = this.a;
        sb2.append(k0Var);
        if (8 % k0Var.d != 0) {
            Character ch2 = this.b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public n0(String str, String str2) {
        this(new k0(str, str2.toCharArray()), (Character) '=');
    }
}
