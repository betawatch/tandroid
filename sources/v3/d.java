package v3;

import d5.g0;
import d5.z;
import h3.t0;
import h3.t1;
import h7.t;
import j4.u0;
import java.util.Arrays;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements k {
    public m a;
    public i b;
    public boolean c;

    public final boolean a(l lVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            z zVar = new z(min);
            lVar.b(0, min, zVar.a);
            zVar.C(0);
            if (zVar.a() >= 5 && zVar.r() == 127 && zVar.s() == 1179402563) {
                this.b = new c();
                return true;
            }
            zVar.C(0);
            try {
                z10 = t.c(1, zVar, true);
            } catch (t1 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new j();
            } else {
                zVar.C(0);
                if (h.e(zVar, h.o)) {
                    this.b = new h();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        z zVar;
        int i10;
        byte[] bArr;
        d5.a.j(this.a);
        if (this.b == null) {
            if (!a(lVar)) {
                throw t1.a("Failed to determine bitstream type", null);
            }
            ((m3.h) lVar).f = 0;
        }
        if (!this.c) {
            w C = this.a.C(0, 1);
            this.a.A();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = C;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        d5.a.j(iVar2.b);
        int i11 = g0.a;
        int i12 = iVar2.h;
        long j10 = -1;
        if (i12 != 0) {
            if (i12 == 1) {
                ((m3.h) lVar).t((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long b10 = iVar2.d.b(lVar);
            if (b10 >= 0) {
                nVar.a = b10;
                return 1;
            }
            if (b10 < -1) {
                iVar2.a(-(b10 + 2));
            }
            if (!iVar2.l) {
                m3.t l10 = iVar2.d.l();
                d5.a.j(l10);
                iVar2.c.n(l10);
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(lVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            z zVar2 = eVar.b;
            long b11 = iVar2.b(zVar2);
            if (b11 >= 0) {
                long j11 = iVar2.g;
                if (j11 + b11 >= iVar2.e) {
                    iVar2.b.a(zVar2.c, zVar2);
                    iVar2.b.e((j11 * 1000000) / iVar2.i, 1, zVar2.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += b11;
            return 0;
        }
        while (true) {
            boolean b12 = eVar.b(lVar);
            z zVar3 = eVar.b;
            if (!b12) {
                iVar2.h = 3;
                return -1;
            }
            long j12 = ((m3.h) lVar).d;
            long j13 = j10;
            long j14 = iVar2.f;
            iVar2.k = j12 - j14;
            if (iVar2.c(zVar3, j14, iVar2.j)) {
                iVar2.f = ((m3.h) lVar).d;
                j10 = j13;
            } else {
                t0 t0Var = (t0) iVar2.j.b;
                iVar2.i = t0Var.P;
                if (!iVar2.m) {
                    iVar2.b.c(t0Var);
                    iVar2.m = true;
                }
                u0 u0Var = (u0) iVar2.j.c;
                if (u0Var != null) {
                    iVar2.d = u0Var;
                } else {
                    long j15 = ((m3.h) lVar).c;
                    if (j15 != j13) {
                        f fVar = eVar.a;
                        boolean z10 = (fVar.a & 4) != 0;
                        long j16 = iVar2.f;
                        long j17 = fVar.d + fVar.e;
                        long j18 = fVar.b;
                        zVar = zVar3;
                        i10 = 2;
                        iVar2.d = new b(iVar2, j16, j15, j17, j18, z10);
                        iVar2.h = i10;
                        bArr = zVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        zVar.A(zVar.c, Arrays.copyOf(bArr, Math.max(65025, zVar.c)));
                        return 0;
                    }
                    iVar2.d = new za.b(22);
                }
                zVar = zVar3;
                i10 = 2;
                iVar2.h = i10;
                bArr = zVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.a = mVar;
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        try {
            return a(lVar);
        } catch (t1 unused) {
            return false;
        }
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        i iVar = this.b;
        if (iVar != null) {
            e eVar = iVar.a;
            f fVar = eVar.a;
            fVar.a = 0;
            fVar.b = 0L;
            fVar.c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.b.z(0);
            eVar.c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.l);
                return;
            }
            if (iVar.h != 0) {
                long j12 = (iVar.i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                int i10 = g0.a;
                gVar.A(j12);
                iVar.h = 2;
            }
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
