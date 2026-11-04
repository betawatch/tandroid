package p7;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x0 extends d1 {
    public final t0 a;

    public x0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c((byte) 64);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        t0 t0Var = ((x0) d1Var).a;
        t0 t0Var2 = this.a;
        byte[] bArr = t0Var2.b;
        int length = bArr.length;
        byte[] bArr2 = t0Var.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return q0.a.compare(t0Var2.p(), t0Var.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            return this.a.equals(((x0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        k0 k0Var;
        int i3;
        boolean z10;
        l0 l0Var = n0.d;
        n0 n0Var = l0Var.c;
        if (n0Var == null) {
            k0 k0Var2 = l0Var.a;
            char[] cArr = k0Var2.b;
            int i10 = 0;
            while (true) {
                if (i10 >= cArr.length) {
                    k0Var = k0Var2;
                    break;
                }
                char c2 = cArr[i10];
                if (c2 < 'a' || c2 > 'z') {
                    i10++;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= cArr.length) {
                            z10 = false;
                            break;
                        }
                        char c10 = cArr[i11];
                        if (c10 >= 'A' && c10 <= 'Z') {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    if (z10) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        char c11 = cArr[i12];
                        if (c11 >= 97 && c11 <= 122) {
                            c11 ^= 32;
                        }
                        cArr2[i12] = (char) c11;
                    }
                    k0Var = new k0(k0Var2.a.concat(".upperCase()"), cArr2);
                    byte[] bArr = k0Var.g;
                    if (k0Var2.h && !k0Var.h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i3 = 65; i3 <= 90; i3++) {
                            int i13 = i3 | 32;
                            byte b10 = bArr[i3];
                            byte b11 = bArr[i13];
                            if (b10 == -1) {
                                copyOf[i3] = b11;
                            } else {
                                char c12 = (char) i3;
                                char c13 = (char) i13;
                                if (b11 != -1) {
                                    throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                }
                                copyOf[i13] = b10;
                            }
                        }
                        k0Var = new k0(k0Var.a.concat(".ignoreCase()"), k0Var.b, copyOf, true);
                    }
                }
            }
            n0Var = k0Var == k0Var2 ? l0Var : new l0(k0Var);
            l0Var.c = n0Var;
        }
        byte[] p10 = this.a.p();
        return a1.g.q("h'", n0Var.c(p10.length, p10), "'");
    }

    @Override // p7.d1
    public final int zza() {
        return d1.c((byte) 64);
    }
}
