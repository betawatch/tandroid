package tc;

import c5.c0;
import e2.j0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(c0 c0Var, c0 c0Var2) {
        boolean n10;
        int[] iArr = {0};
        do {
            n10 = c0Var.n(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int s10 = c0Var.s(2, iArr);
            if (s10 == 0) {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int l4 = ((c0Var.l(i10 + 1) & 255) * 256) + (c0Var.l(i10) & 255);
                int i11 = i10 + 4;
                c0Var2.getClass();
                byte[] array = ((ByteBuffer) c0Var.c).array();
                int capacity = ((ByteBuffer) c0Var2.c).capacity();
                int i12 = c0Var2.b + l4;
                if (capacity < i12) {
                    c0Var2.j(i12 + 1024);
                }
                ((ByteBuffer) c0Var2.c).put(array, i11, l4);
                c0Var2.b += l4;
                iArr[0] = (i11 + l4) * 8;
            } else if (s10 == 1) {
                b(c0Var, iArr, c0Var2, g.f, f.f);
            } else {
                if (s10 != 2) {
                    throw new com.google.firebase.messaging.r(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(c0Var, iArr, j0VarArr);
                b(c0Var, iArr, c0Var2, j0VarArr[0], j0VarArr[1]);
            }
            if (c0Var.b <= iArr[0] / 8) {
                n10 = true;
            }
        } while (!n10);
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
                    bArr[i12] = c0Var2.l(i13);
                    i12++;
                    i13++;
                }
                c0Var2.r(bArr);
            } else {
                c0Var2.p(k10);
            }
        }
    }
}
