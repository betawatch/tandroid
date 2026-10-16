package v2;

import b2.w0;
import b2.x;
import c3.i0;
import g2.b0;
import u2.c1;
import v7.k7;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, mVar, xVar, i10, obj, j10, j11, j12, j13, j14);
        this.E = i11;
        this.F = j15;
        this.G = eVar;
    }

    @Override // y2.i
    public final void a() {
        n3.b bVar = this.x;
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
            long j11 = this.v;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.F;
            long j13 = this.w;
            eVar.b(bVar, j12, j13 != -9223372036854775807L ? j13 - this.F : -9223372036854775807L);
        }
        try {
            g2.m b10 = this.b.b(this.H);
            b0 b0Var = this.r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.I) {
                try {
                    int f7 = this.G.a.f(lVar, e.v);
                    u6.p(f7 != 1);
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
            if (w0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                i0 j02 = bVar.j0(4);
                int i12 = i10 * i11;
                long j14 = (this.n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    j02.d(0, new e2.x());
                    j02.c(i13 * j14, 0, 0, 0, null);
                }
            }
            k7.a(this.r);
            this.J = !this.I;
        } catch (Throwable th2) {
            k7.a(this.r);
            throw th2;
        }
    }

    @Override // y2.i
    public final void a0() {
        this.I = true;
    }

    @Override // v2.l
    public final long b() {
        return this.s + this.E;
    }

    @Override // v2.l
    public final boolean c() {
        return this.J;
    }
}
