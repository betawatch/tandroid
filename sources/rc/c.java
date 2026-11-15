package rc;

import ab.b0;
import h2.j0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(f5.v vVar, f5.v vVar2) {
        boolean n10;
        int[] iArr = {0};
        do {
            n10 = vVar.n(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int s5 = vVar.s(iArr, 2);
            if (s5 == 0) {
                int i7 = ((iArr[0] + 7) & (-8)) / 8;
                int l10 = ((vVar.l(i7 + 1) & 255) * 256) + (vVar.l(i7) & 255);
                int i10 = i7 + 4;
                vVar2.getClass();
                byte[] array = ((ByteBuffer) vVar.c).array();
                int capacity = ((ByteBuffer) vVar2.c).capacity();
                int i11 = vVar2.b + l10;
                if (capacity < i11) {
                    vVar2.i(i11 + 1024);
                }
                ((ByteBuffer) vVar2.c).put(array, i10, l10);
                vVar2.b += l10;
                iArr[0] = (i10 + l10) * 8;
            } else if (s5 == 1) {
                b(vVar, iArr, vVar2, g.e, f.e);
            } else {
                if (s5 != 2) {
                    throw new b0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(vVar, iArr, j0VarArr);
                b(vVar, iArr, vVar2, j0VarArr[0], j0VarArr[1]);
            }
            if (vVar.b <= iArr[0] / 8) {
                n10 = true;
            }
        } while (!n10);
    }

    public static void b(f5.v vVar, int[] iArr, f5.v vVar2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int m10 = j0Var.m(vVar, iArr);
            if (m10 == 256) {
                return;
            }
            if (m10 < 0 || m10 > 255) {
                int f10 = d.f(vVar, iArr, m10);
                int d = d.d(vVar, iArr, j0Var2);
                int i7 = vVar2.b;
                byte[] bArr = new byte[f10];
                int i10 = i7 - d;
                int i11 = 0;
                int i12 = i10;
                while (i11 < f10) {
                    if (i7 <= i12) {
                        i12 = i10;
                    }
                    bArr[i11] = vVar2.l(i12);
                    i11++;
                    i12++;
                }
                vVar2.r(bArr);
            } else {
                vVar2.q(m10);
            }
        }
    }
}
