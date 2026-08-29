package x3;

import f5.d0;
import f5.w;
import i7.w5;
import j3.t0;
import j3.t1;
import java.util.Arrays;
import l4.v0;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.t;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            w wVar = new w(min);
            lVar.a(0, min, wVar.a);
            wVar.C(0);
            if (wVar.a() >= 5 && wVar.r() == 127 && wVar.s() == 1179402563) {
                this.b = new c();
                return true;
            }
            wVar.C(0);
            try {
                z10 = w5.c(1, wVar, true);
            } catch (t1 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new j();
            } else {
                wVar.C(0);
                if (h.e(wVar, h.o)) {
                    this.b = new h();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(l lVar, n nVar) {
        w wVar;
        int i10;
        byte[] bArr;
        f5.a.j(this.a);
        if (this.b == null) {
            if (!a(lVar)) {
                throw t1.a("Failed to determine bitstream type", null);
            }
            ((o3.h) lVar).f = 0;
        }
        if (!this.c) {
            o3.w Z1 = this.a.Z1(0, 1);
            this.a.e1();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = Z1;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        f5.a.j(iVar2.b);
        int i11 = d0.a;
        int i12 = iVar2.h;
        long j10 = -1;
        if (i12 != 0) {
            if (i12 == 1) {
                ((o3.h) lVar).t((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long i13 = iVar2.d.i(lVar);
            if (i13 >= 0) {
                nVar.a = i13;
                return 1;
            }
            if (i13 < -1) {
                iVar2.a(-(i13 + 2));
            }
            if (!iVar2.l) {
                t v = iVar2.d.v();
                f5.a.j(v);
                iVar2.c.D1(v);
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(lVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            w wVar2 = eVar.b;
            long b10 = iVar2.b(wVar2);
            if (b10 >= 0) {
                long j11 = iVar2.g;
                if (j11 + b10 >= iVar2.e) {
                    iVar2.b.e(wVar2.c, wVar2);
                    iVar2.b.c((j11 * 1000000) / iVar2.i, 1, wVar2.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += b10;
            return 0;
        }
        while (true) {
            boolean b11 = eVar.b(lVar);
            w wVar3 = eVar.b;
            if (!b11) {
                iVar2.h = 3;
                return -1;
            }
            long j12 = ((o3.h) lVar).d;
            long j13 = j10;
            long j14 = iVar2.f;
            iVar2.k = j12 - j14;
            if (iVar2.c(wVar3, j14, iVar2.j)) {
                iVar2.f = ((o3.h) lVar).d;
                j10 = j13;
            } else {
                t0 t0Var = (t0) iVar2.j.b;
                iVar2.i = t0Var.P;
                if (!iVar2.m) {
                    iVar2.b.b(t0Var);
                    iVar2.m = true;
                }
                v0 v0Var = (v0) iVar2.j.c;
                if (v0Var != null) {
                    iVar2.d = v0Var;
                } else {
                    long j15 = ((o3.h) lVar).c;
                    if (j15 != j13) {
                        f fVar = eVar.a;
                        boolean z10 = (fVar.a & 4) != 0;
                        long j16 = iVar2.f;
                        long j17 = fVar.d + fVar.e;
                        long j18 = fVar.b;
                        wVar = wVar3;
                        i10 = 2;
                        iVar2.d = new b(iVar2, j16, j15, j17, j18, z10);
                        iVar2.h = i10;
                        bArr = wVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        wVar.A(wVar.c, Arrays.copyOf(bArr, Math.max(65025, wVar.c)));
                        return 0;
                    }
                    iVar2.d = new ab.b(24);
                }
                wVar = wVar3;
                i10 = 2;
                iVar2.h = i10;
                bArr = wVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // o3.k
    public final boolean e(l lVar) {
        try {
            return a(lVar);
        } catch (t1 unused) {
            return false;
        }
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
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
                int i10 = d0.a;
                gVar.z(j12);
                iVar.h = 2;
            }
        }
    }

    @Override // o3.k
    public final void i(m mVar) {
        this.a = mVar;
    }

    @Override // o3.k
    public final void release() {
    }
}
