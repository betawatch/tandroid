package x6;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class m0 {
    public static final k0 d;
    public final j0 a;
    public final Character b;
    public volatile m0 c;

    static {
        new l0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new l0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new k0(new j0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public m0(j0 j0Var, Character ch2) {
        this.a = j0Var;
        if (ch2 != null) {
            byte[] bArr = j0Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i9) {
        int i10 = 0;
        a.m(0, i9, bArr.length);
        while (i10 < i9) {
            j0 j0Var = this.a;
            b(sb2, bArr, i10, Math.min(j0Var.f, i9 - i10));
            i10 += j0Var.f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i9, int i10) {
        a.m(i9, i9 + i10, bArr.length);
        j0 j0Var = this.a;
        int i11 = j0Var.f;
        int i12 = j0Var.d;
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int i13 = 0;
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j10 = (j10 | (bArr[i9 + i14] & 255)) << 8;
        }
        int i15 = (i10 + 1) * 8;
        while (i13 < i10 * 8) {
            sb2.append(j0Var.b[((int) (j10 >>> ((i15 - i12) - i13))) & j0Var.c]);
            i13 += i12;
        }
        if (this.b != null) {
            while (i13 < j0Var.f * 8) {
                sb2.append('=');
                i13 += i12;
            }
        }
    }

    public final String c(int i9, byte[] bArr) {
        a.m(0, i9, bArr.length);
        j0 j0Var = this.a;
        int i10 = j0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(j0Var.e * a.a(i9, i10));
        try {
            a(sb2, bArr, i9);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.a.equals(m0Var.a) && Objects.equals(this.b, m0Var.b)) {
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
        j0 j0Var = this.a;
        sb2.append(j0Var);
        if (8 % j0Var.d != 0) {
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

    public m0(String str, String str2) {
        this(new j0(str, str2.toCharArray()), (Character) '=');
    }
}
