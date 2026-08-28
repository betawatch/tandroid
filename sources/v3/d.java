package v3;

import d5.f0;
import d5.y;
import g7.t;
import h3.t0;
import h3.t1;
import j4.v0;
import java.util.Arrays;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            y yVar = new y(min);
            lVar.c(0, min, yVar.a);
            yVar.C(0);
            if (yVar.a() >= 5 && yVar.r() == 127 && yVar.s() == 1179402563) {
                this.b = new c();
                return true;
            }
            yVar.C(0);
            try {
                z10 = t.c(1, yVar, true);
            } catch (t1 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new j();
            } else {
                yVar.C(0);
                if (h.e(yVar, h.o)) {
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
        y yVar;
        int i9;
        byte[] bArr;
        d5.a.j(this.a);
        if (this.b == null) {
            if (!a(lVar)) {
                throw t1.a("Failed to determine bitstream type", null);
            }
            ((m3.h) lVar).f = 0;
        }
        if (!this.c) {
            w I = this.a.I(0, 1);
            this.a.B();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = I;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        d5.a.j(iVar2.b);
        int i10 = f0.a;
        int i11 = iVar2.h;
        long j10 = -1;
        if (i11 != 0) {
            if (i11 == 1) {
                ((m3.h) lVar).u((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i11 != 2) {
                if (i11 == 3) {
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
                m3.t D = iVar2.d.D();
                d5.a.j(D);
                iVar2.c.y(D);
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(lVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            y yVar2 = eVar.b;
            long b11 = iVar2.b(yVar2);
            if (b11 >= 0) {
                long j11 = iVar2.g;
                if (j11 + b11 >= iVar2.e) {
                    iVar2.b.a(yVar2.c, yVar2);
                    iVar2.b.e((j11 * 1000000) / iVar2.i, 1, yVar2.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += b11;
            return 0;
        }
        while (true) {
            boolean b12 = eVar.b(lVar);
            y yVar3 = eVar.b;
            if (!b12) {
                iVar2.h = 3;
                return -1;
            }
            long j12 = ((m3.h) lVar).d;
            long j13 = j10;
            long j14 = iVar2.f;
            iVar2.k = j12 - j14;
            if (iVar2.c(yVar3, j14, iVar2.j)) {
                iVar2.f = ((m3.h) lVar).d;
                j10 = j13;
            } else {
                t0 t0Var = (t0) iVar2.j.b;
                iVar2.i = t0Var.P;
                if (!iVar2.m) {
                    iVar2.b.c(t0Var);
                    iVar2.m = true;
                }
                v0 v0Var = (v0) iVar2.j.c;
                if (v0Var != null) {
                    iVar2.d = v0Var;
                } else {
                    long j15 = ((m3.h) lVar).c;
                    if (j15 != j13) {
                        f fVar = eVar.a;
                        boolean z10 = (fVar.a & 4) != 0;
                        long j16 = iVar2.f;
                        long j17 = fVar.d + fVar.e;
                        long j18 = fVar.b;
                        yVar = yVar3;
                        i9 = 2;
                        iVar2.d = new b(iVar2, j16, j15, j17, j18, z10);
                        iVar2.h = i9;
                        bArr = yVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        yVar.A(yVar.c, Arrays.copyOf(bArr, Math.max(65025, yVar.c)));
                        return 0;
                    }
                    iVar2.d = new ya.b(22);
                }
                yVar = yVar3;
                i9 = 2;
                iVar2.h = i9;
                bArr = yVar.a;
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
                int i9 = f0.a;
                gVar.O(j12);
                iVar.h = 2;
            }
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
