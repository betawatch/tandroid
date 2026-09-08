package x3;

import b2.s0;
import c3.p;
import e2.v;
import java.io.EOFException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final v g = new v(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        v vVar = this.g;
        vVar.G(27);
        try {
            z11 = pVar.j(vVar.a, 0, 27, z10);
        } catch (EOFException e7) {
            if (!z10) {
                throw e7;
            }
            z11 = false;
        }
        if (z11 && vVar.z() == 1332176723) {
            if (vVar.x() == 0) {
                this.a = vVar.x();
                this.b = vVar.m();
                vVar.o();
                vVar.o();
                vVar.o();
                int x10 = vVar.x();
                this.c = x10;
                this.d = x10 + 27;
                vVar.G(x10);
                try {
                    z12 = pVar.j(vVar.a, 0, this.c, z10);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.c; i10++) {
                        int x11 = vVar.x();
                        this.f[i10] = x11;
                        this.e += x11;
                    }
                    return true;
                }
            } else if (!z10) {
                throw s0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j3) {
        boolean z10;
        e2.d.b(pVar.getPosition() == pVar.k());
        v vVar = this.g;
        vVar.G(4);
        while (true) {
            if (j3 != -1 && pVar.getPosition() + 4 >= j3) {
                break;
            }
            try {
                z10 = pVar.j(vVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            vVar.J(0);
            if (vVar.z() == 1332176723) {
                pVar.q();
                return true;
            }
            pVar.r(1);
        }
        do {
            if (j3 != -1 && pVar.getPosition() >= j3) {
                break;
            }
        } while (pVar.skip(1) != -1);
        return false;
    }
}
