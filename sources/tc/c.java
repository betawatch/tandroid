package tc;

import c5.c0;
import e2.j0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(c0 c0Var, c0 c0Var2) {
        boolean o10;
        int[] iArr = {0};
        do {
            o10 = c0Var.o(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int s10 = c0Var.s(2, iArr);
            if (s10 == 0) {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int m10 = ((c0Var.m(i10 + 1) & 255) * 256) + (c0Var.m(i10) & 255);
                int i11 = i10 + 4;
                c0Var2.getClass();
                byte[] array = ((ByteBuffer) c0Var.c).array();
                int capacity = ((ByteBuffer) c0Var2.c).capacity();
                int i12 = c0Var2.b + m10;
                if (capacity < i12) {
                    c0Var2.l(i12 + 1024);
                }
                ((ByteBuffer) c0Var2.c).put(array, i11, m10);
                c0Var2.b += m10;
                iArr[0] = (i11 + m10) * 8;
            } else if (s10 == 1) {
                b(c0Var, iArr, c0Var2, g.e, f.e);
            } else {
                if (s10 != 2) {
                    throw new com.google.firebase.messaging.q(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(c0Var, iArr, j0VarArr);
                b(c0Var, iArr, c0Var2, j0VarArr[0], j0VarArr[1]);
            }
            if (c0Var.b <= iArr[0] / 8) {
                o10 = true;
            }
        } while (!o10);
    }

    public static void b(c0 c0Var, int[] iArr, c0 c0Var2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int i10 = j0Var.i(c0Var, iArr);
            if (i10 == 256) {
                return;
            }
            if (i10 < 0 || i10 > 255) {
                int f7 = d.f(c0Var, iArr, i10);
                int d = d.d(c0Var, iArr, j0Var2);
                int i11 = c0Var2.b;
                byte[] bArr = new byte[f7];
                int i12 = i11 - d;
                int i13 = 0;
                int i14 = i12;
                while (i13 < f7) {
                    if (i11 <= i14) {
                        i14 = i12;
                    }
                    bArr[i13] = c0Var2.m(i14);
                    i13++;
                    i14++;
                }
                c0Var2.r(bArr);
            } else {
                c0Var2.q(i10);
            }
        }
    }
}
