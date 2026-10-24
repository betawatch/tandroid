package x3;

import b2.w0;
import c3.r;
import e2.x;
import java.io.EOFException;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final x g = new x(255);

    public final boolean a(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        x xVar = this.g;
        xVar.K(27);
        try {
            z11 = rVar.j(xVar.a, 0, 27, z10);
        } catch (EOFException e) {
            if (!z10) {
                throw e;
            }
            z11 = false;
        }
        if (z11 && xVar.C() == 1332176723) {
            if (xVar.A() == 0) {
                this.a = xVar.A();
                this.b = xVar.p();
                xVar.r();
                xVar.r();
                xVar.r();
                int A = xVar.A();
                this.c = A;
                this.d = A + 27;
                xVar.K(A);
                try {
                    z12 = rVar.j(xVar.a, 0, this.c, z10);
                } catch (EOFException e7) {
                    if (!z10) {
                        throw e7;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.c; i10++) {
                        int A2 = xVar.A();
                        this.f[i10] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw w0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(r rVar, long j10) {
        boolean z10;
        u6.g(rVar.getPosition() == rVar.k());
        x xVar = this.g;
        xVar.K(4);
        while (true) {
            if (j10 != -1 && rVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = rVar.j(xVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            xVar.N(0);
            if (xVar.C() == 1332176723) {
                rVar.q();
                return true;
            }
            rVar.r(1);
        }
        do {
            if (j10 != -1 && rVar.getPosition() >= j10) {
                break;
            }
        } while (rVar.skip(1) != -1);
        return false;
    }
}
