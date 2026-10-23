package v2;

import b2.v0;
import b2.w;
import c3.j0;
import e2.x;
import g2.b0;
import u2.d1;
import v7.k7;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, mVar, wVar, i10, obj, j10, j11, j12, j13, j14);
        this.E = i11;
        this.F = j15;
        this.G = eVar;
    }

    @Override // y2.i
    public final void O() {
        this.I = true;
    }

    @Override // y2.i
    public final void a() {
        n2.e eVar = this.x;
        eVar.getClass();
        if (this.H == 0) {
            long j10 = this.F;
            for (d1 d1Var : (d1[]) eVar.c) {
                if (d1Var.H != j10) {
                    d1Var.H = j10;
                    d1Var.B = true;
                }
            }
            e eVar2 = this.G;
            long j11 = this.v;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.F;
            long j13 = this.w;
            eVar2.b(eVar, j12, j13 != -9223372036854775807L ? j13 - this.F : -9223372036854775807L);
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
            w wVar = this.d;
            String str = wVar.r;
            int i10 = wVar.R;
            int i11 = wVar.S;
            if (v0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                j0 r02 = eVar.r0(4);
                int i12 = i10 * i11;
                long j14 = (this.n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    r02.d(0, new x());
                    r02.c(i13 * j14, 0, 0, 0, null);
                }
            }
            k7.a(this.r);
            this.J = !this.I;
        } catch (Throwable th2) {
            k7.a(this.r);
            throw th2;
        }
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
