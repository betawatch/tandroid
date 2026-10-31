package v2;

import b2.v0;
import b2.x;
import c3.k0;
import g2.c0;
import u2.c1;
import v7.l7;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, nVar, xVar, i10, obj, j10, j11, j12, j13, j14);
        this.E = i11;
        this.F = j15;
        this.G = eVar;
    }

    @Override // y2.i
    public final void R1() {
        this.I = true;
    }

    @Override // v2.l
    public final long a() {
        return this.s + this.E;
    }

    @Override // y2.i
    public final void b() {
        u9.b bVar = this.y;
        bVar.getClass();
        if (this.H == 0) {
            long j10 = this.F;
            for (c1 c1Var : (c1[]) bVar.c) {
                if (c1Var.H != j10) {
                    c1Var.H = j10;
                    c1Var.B = true;
                }
            }
            e eVar = this.G;
            long j11 = this.w;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.F;
            long j13 = this.x;
            eVar.b(bVar, j12, j13 != -9223372036854775807L ? j13 - this.F : -9223372036854775807L);
        }
        try {
            g2.n b10 = this.b.b(this.H);
            c0 c0Var = this.r;
            c3.l lVar = new c3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.I) {
                try {
                    int f7 = this.G.a.f(lVar, e.w);
                    t6.p(f7 != 1);
                    if (!(f7 == 0)) {
                        break;
                    }
                } finally {
                    this.H = lVar.d - this.b.e;
                }
            }
            x xVar = this.d;
            String str = xVar.r;
            int i10 = xVar.R;
            int i11 = xVar.S;
            if (v0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                k0 c10 = bVar.c(4);
                int i12 = i10 * i11;
                long j14 = (this.n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    c10.d(0, new e2.x());
                    c10.c(i13 * j14, 0, 0, 0, null);
                }
            }
            l7.a(this.r);
            this.J = !this.I;
        } catch (Throwable th2) {
            l7.a(this.r);
            throw th2;
        }
    }

    @Override // v2.l
    public final boolean c() {
        return this.J;
    }
}
