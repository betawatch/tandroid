package rc;

import h2.j0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(f5.u uVar, f5.u uVar2) {
        boolean n10;
        int[] iArr = {0};
        do {
            n10 = uVar.n(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int s5 = uVar.s(iArr, 2);
            if (s5 == 0) {
                int i7 = ((iArr[0] + 7) & (-8)) / 8;
                int l10 = ((uVar.l(i7 + 1) & 255) * 256) + (uVar.l(i7) & 255);
                int i10 = i7 + 4;
                uVar2.getClass();
                byte[] array = ((ByteBuffer) uVar.c).array();
                int capacity = ((ByteBuffer) uVar2.c).capacity();
                int i11 = uVar2.b + l10;
                if (capacity < i11) {
                    uVar2.i(i11 + 1024);
                }
                ((ByteBuffer) uVar2.c).put(array, i10, l10);
                uVar2.b += l10;
                iArr[0] = (i10 + l10) * 8;
            } else if (s5 == 1) {
                b(uVar, iArr, uVar2, g.e, f.e);
            } else {
                if (s5 != 2) {
                    throw new ab.a0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(uVar, iArr, j0VarArr);
                b(uVar, iArr, uVar2, j0VarArr[0], j0VarArr[1]);
            }
            if (uVar.b <= iArr[0] / 8) {
                n10 = true;
            }
        } while (!n10);
    }

    public static void b(f5.u uVar, int[] iArr, f5.u uVar2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int m10 = j0Var.m(uVar, iArr);
            if (m10 == 256) {
                return;
            }
            if (m10 < 0 || m10 > 255) {
                int f10 = d.f(uVar, iArr, m10);
                int d = d.d(uVar, iArr, j0Var2);
                int i7 = uVar2.b;
                byte[] bArr = new byte[f10];
                int i10 = i7 - d;
                int i11 = 0;
                int i12 = i10;
                while (i11 < f10) {
                    if (i7 <= i12) {
                        i12 = i10;
                    }
                    bArr[i11] = uVar2.l(i12);
                    i11++;
                    i12++;
                }
                uVar2.r(bArr);
            } else {
                uVar2.q(m10);
            }
        }
    }
}
