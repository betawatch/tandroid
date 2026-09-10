package v2;

import b2.r0;
import b2.s;
import c3.h0;
import e2.v;
import g2.b0;
import n7.a1;
import u2.c1;
import v7.n7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i extends a {
    public final int E;
    public final long F;
    public final d G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public i(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11, long j12, long j13, int i11, long j14, d dVar) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j11, j12, j13);
        this.E = i11;
        this.F = j14;
        this.G = dVar;
    }

    @Override // y2.k
    public final void a() {
        a1 a1Var = this.x;
        e2.d.h(a1Var);
        if (this.H == 0) {
            long j3 = this.F;
            for (c1 c1Var : (c1[]) a1Var.c) {
                if (c1Var.F != j3) {
                    c1Var.F = j3;
                    c1Var.z = true;
                }
            }
            d dVar = this.G;
            long j10 = this.v;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.F;
            long j12 = this.w;
            dVar.a(a1Var, j11, j12 != -9223372036854775807L ? j12 - this.F : -9223372036854775807L);
        }
        try {
            g2.m b10 = this.b.b(this.H);
            b0 b0Var = this.r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.I) {
                try {
                    int m10 = this.G.a.m(lVar, d.s);
                    e2.d.g(m10 != 1);
                    if (!(m10 == 0)) {
                        break;
                    }
                } finally {
                    this.H = lVar.d - this.b.e;
                }
            }
            s sVar = this.d;
            String str = sVar.q;
            int i10 = sVar.Q;
            int i11 = sVar.R;
            if (r0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                h0 t02 = a1Var.t0(4);
                int i12 = i10 * i11;
                long j13 = (this.n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    t02.d(0, new v());
                    t02.c(i13 * j13, 0, 0, 0, null);
                }
            }
            n7.a(this.r);
            this.J = !this.I;
        } catch (Throwable th2) {
            n7.a(this.r);
            throw th2;
        }
    }

    @Override // v2.k
    public final long b() {
        return this.s + this.E;
    }

    @Override // v2.k
    public final boolean c() {
        return this.J;
    }

    @Override // y2.k
    public final void k() {
        this.I = true;
    }
}
