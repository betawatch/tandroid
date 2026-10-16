package tc;

import c5.c0;
import e2.j0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(c0 c0Var, c0 c0Var2) {
        boolean i10;
        int[] iArr = {0};
        do {
            i10 = c0Var.i(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int n10 = c0Var.n(2, iArr);
            if (n10 == 0) {
                int i11 = ((iArr[0] + 7) & (-8)) / 8;
                int g10 = ((c0Var.g(i11 + 1) & 255) * 256) + (c0Var.g(i11) & 255);
                int i12 = i11 + 4;
                c0Var2.getClass();
                byte[] array = ((ByteBuffer) c0Var.c).array();
                int capacity = ((ByteBuffer) c0Var2.c).capacity();
                int i13 = c0Var2.b + g10;
                if (capacity < i13) {
                    c0Var2.f(i13 + 1024);
                }
                ((ByteBuffer) c0Var2.c).put(array, i12, g10);
                c0Var2.b += g10;
                iArr[0] = (i12 + g10) * 8;
            } else if (n10 == 1) {
                b(c0Var, iArr, c0Var2, g.f, f.f);
            } else {
                if (n10 != 2) {
                    throw new com.google.firebase.messaging.r(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(c0Var, iArr, j0VarArr);
                b(c0Var, iArr, c0Var2, j0VarArr[0], j0VarArr[1]);
            }
            if (c0Var.b <= iArr[0] / 8) {
                i10 = true;
            }
        } while (!i10);
    }

    public static void b(c0 c0Var, int[] iArr, c0 c0Var2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int k10 = j0Var.k(c0Var, iArr);
            if (k10 == 256) {
                return;
            }
            if (k10 < 0 || k10 > 255) {
                int f7 = d.f(c0Var, iArr, k10);
                int d = d.d(c0Var, iArr, j0Var2);
                int i10 = c0Var2.b;
                byte[] bArr = new byte[f7];
                int i11 = i10 - d;
                int i12 = 0;
                int i13 = i11;
                while (i12 < f7) {
                    if (i10 <= i13) {
                        i13 = i11;
                    }
                    bArr[i12] = c0Var2.g(i13);
                    i12++;
                    i13++;
                }
                c0Var2.m(bArr);
            } else {
                c0Var2.k(k10);
            }
        }
    }
}
