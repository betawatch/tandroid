package y6;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w0 extends c1 {
    public final s0 a;

    public w0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) 64);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        s0 s0Var = ((w0) c1Var).a;
        s0 s0Var2 = this.a;
        byte[] bArr = s0Var2.b;
        int length = bArr.length;
        byte[] bArr2 = s0Var.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return p0.a.compare(s0Var2.u(), s0Var.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            return this.a.equals(((w0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        j0 j0Var;
        int i10;
        boolean z10;
        k0 k0Var = m0.d;
        m0 m0Var = k0Var.c;
        if (m0Var == null) {
            j0 j0Var2 = k0Var.a;
            char[] cArr = j0Var2.b;
            int i11 = 0;
            while (true) {
                if (i11 >= cArr.length) {
                    j0Var = j0Var2;
                    break;
                }
                char c10 = cArr[i11];
                if (c10 < 'a' || c10 > 'z') {
                    i11++;
                } else {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= cArr.length) {
                            z10 = false;
                            break;
                        }
                        char c11 = cArr[i12];
                        if (c11 >= 'A' && c11 <= 'Z') {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    if (z10) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i13 = 0; i13 < cArr.length; i13++) {
                        char c12 = cArr[i13];
                        if (c12 >= 97 && c12 <= 122) {
                            c12 ^= 32;
                        }
                        cArr2[i13] = (char) c12;
                    }
                    j0Var = new j0(j0Var2.a.concat(".upperCase()"), cArr2);
                    byte[] bArr = j0Var.g;
                    if (j0Var2.h && !j0Var.h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i10 = 65; i10 <= 90; i10++) {
                            int i14 = i10 | 32;
                            byte b10 = bArr[i10];
                            byte b11 = bArr[i14];
                            if (b10 == -1) {
                                copyOf[i10] = b11;
                            } else {
                                char c13 = (char) i10;
                                char c14 = (char) i14;
                                if (b11 != -1) {
                                    throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                }
                                copyOf[i14] = b10;
                            }
                        }
                        j0Var = new j0(j0Var.a.concat(".ignoreCase()"), j0Var.b, copyOf, true);
                    }
                }
            }
            m0Var = j0Var == j0Var2 ? k0Var : new k0(j0Var);
            k0Var.c = m0Var;
        }
        byte[] u10 = this.a.u();
        return a9.p.m("h'", m0Var.c(u10.length, u10), "'");
    }

    @Override // y6.c1
    public final int zza() {
        return c1.c((byte) 64);
    }
}
