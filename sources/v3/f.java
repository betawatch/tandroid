package v3;

import d5.y;
import h3.t1;
import java.io.EOFException;
import m3.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final y g = new y(255);

    public final boolean a(l lVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        y yVar = this.g;
        yVar.z(27);
        try {
            z11 = lVar.g(yVar.a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            z11 = false;
        }
        if (z11 && yVar.s() == 1332176723) {
            if (yVar.r() == 0) {
                this.a = yVar.r();
                this.b = yVar.h();
                yVar.i();
                yVar.i();
                yVar.i();
                int r10 = yVar.r();
                this.c = r10;
                this.d = r10 + 27;
                yVar.z(r10);
                try {
                    z12 = lVar.g(yVar.a, 0, this.c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i9 = 0; i9 < this.c; i9++) {
                        int r11 = yVar.r();
                        this.f[i9] = r11;
                        this.e += r11;
                    }
                    return true;
                }
            } else if (!z10) {
                throw t1.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(l lVar, long j10) {
        boolean z10;
        d5.a.f(lVar.getPosition() == lVar.k());
        y yVar = this.g;
        yVar.z(4);
        while (true) {
            if (j10 != -1 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = lVar.g(yVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            yVar.C(0);
            if (yVar.s() == 1332176723) {
                lVar.t();
                return true;
            }
            lVar.u(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
