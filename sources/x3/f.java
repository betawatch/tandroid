package x3;

import f5.w;
import j3.t1;
import java.io.EOFException;
import o3.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final w g = new w(255);

    public final boolean a(l lVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        w wVar = this.g;
        wVar.z(27);
        try {
            z11 = lVar.f(wVar.a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            z11 = false;
        }
        if (z11 && wVar.s() == 1332176723) {
            if (wVar.r() == 0) {
                this.a = wVar.r();
                this.b = wVar.h();
                wVar.i();
                wVar.i();
                wVar.i();
                int r6 = wVar.r();
                this.c = r6;
                this.d = r6 + 27;
                wVar.z(r6);
                try {
                    z12 = lVar.f(wVar.a, 0, this.c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    z12 = false;
                }
                if (z12) {
                    for (int i10 = 0; i10 < this.c; i10++) {
                        int r9 = wVar.r();
                        this.f[i10] = r9;
                        this.e += r9;
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
        f5.a.f(lVar.getPosition() == lVar.h());
        w wVar = this.g;
        wVar.z(4);
        while (true) {
            if (j10 != -1 && lVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = lVar.f(wVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            wVar.C(0);
            if (wVar.s() == 1332176723) {
                lVar.s();
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
