package v3;

import d5.z;
import h3.t1;
import java.io.EOFException;
import m3.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final z g = new z(255);

    public final boolean a(l lVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        z zVar = this.g;
        zVar.z(27);
        try {
            z11 = lVar.g(zVar.a, 0, 27, z10);
        } catch (EOFException e9) {
            if (!z10) {
                throw e9;
            }
            z11 = false;
        }
        if (z11 && zVar.s() == 1332176723) {
            if (zVar.r() == 0) {
                this.a = zVar.r();
                this.b = zVar.h();
                zVar.i();
                zVar.i();
                zVar.i();
                int r10 = zVar.r();
                this.c = r10;
                this.d = r10 + 27;
                zVar.z(r10);
                try {
                    z12 = lVar.g(zVar.a, 0, this.c, z10);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.c; i10++) {
                        int r11 = zVar.r();
                        this.f[i10] = r11;
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
        d5.a.f(lVar.getPosition() == lVar.i());
        z zVar = this.g;
        zVar.z(4);
        while (true) {
            if (j10 != -1 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = lVar.g(zVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            zVar.C(0);
            if (zVar.s() == 1332176723) {
                lVar.q();
                return true;
            }
            lVar.t(1);
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.skip(1) != -1);
        return false;
    }
}
