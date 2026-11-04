package z3;

import b8.zb;
import d2.v0;
import e3.p;
import g2.y;
import java.io.EOFException;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[hs.e4];
    public final y g = new y(hs.e4);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        y yVar = this.g;
        yVar.K(27);
        try {
            z11 = pVar.h(yVar.a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            z11 = false;
        }
        if (z11 && yVar.C() == 1332176723) {
            if (yVar.A() == 0) {
                this.a = yVar.A();
                this.b = yVar.p();
                yVar.r();
                yVar.r();
                yVar.r();
                int A = yVar.A();
                this.c = A;
                this.d = A + 27;
                yVar.K(A);
                try {
                    z12 = pVar.h(yVar.a, 0, this.c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i3 = 0; i3 < this.c; i3++) {
                        int A2 = yVar.A();
                        this.f[i3] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw v0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j10) {
        boolean z10;
        zb.f(pVar.getPosition() == pVar.k());
        y yVar = this.g;
        yVar.K(4);
        while (true) {
            if (j10 != -1 && pVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = pVar.h(yVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            yVar.N(0);
            if (yVar.C() == 1332176723) {
                pVar.o();
                return true;
            }
            pVar.u(1);
        }
        do {
            if (j10 != -1 && pVar.getPosition() >= j10) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
