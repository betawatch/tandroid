package y2;

import a8.ma;
import c8.t0;
import e2.s0;
import e2.u;
import f3.j0;
import h2.x;
import j2.b0;
import x2.c1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j extends a {
    public final int F;
    public final long G;
    public final e H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public j(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, long j12, long j13, int i10, long j14, e eVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11, j12, j13);
        this.F = i10;
        this.G = j14;
        this.H = eVar;
    }

    @Override // b3.m
    public final void a() {
        s2.e eVar = this.y;
        eVar.getClass();
        if (this.I == 0) {
            long j3 = this.G;
            for (c1 c1Var : (c1[]) eVar.c) {
                if (c1Var.H != j3) {
                    c1Var.H = j3;
                    c1Var.B = true;
                }
            }
            e eVar2 = this.H;
            long j10 = this.w;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.G;
            long j12 = this.x;
            eVar2.b(eVar, j11, j12 != -9223372036854775807L ? j12 - this.G : -9223372036854775807L);
        }
        try {
            j2.m b10 = this.b.b(this.I);
            b0 b0Var = this.r;
            f3.l lVar = new f3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.J) {
                try {
                    int f10 = this.H.a.f(lVar, e.w);
                    ma.p(f10 != 1);
                    if (!(f10 == 0)) {
                        break;
                    }
                } finally {
                    this.I = lVar.d - this.b.e;
                }
            }
            u uVar = this.d;
            String str = uVar.r;
            int i7 = uVar.R;
            int i10 = uVar.S;
            if (s0.k(str) && ((i7 > 1 || i10 > 1) && i7 != -1 && i10 != -1)) {
                j0 f11 = eVar.f(4);
                int i11 = i7 * i10;
                long j13 = (this.n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    f11.b(0, new x());
                    f11.c(i12 * j13, 0, 0, 0, null);
                }
            }
            t0.a(this.r);
            this.K = !this.J;
        } catch (Throwable th2) {
            t0.a(this.r);
            throw th2;
        }
    }

    @Override // y2.l
    public final long b() {
        return this.s + this.F;
    }

    @Override // y2.l
    public final boolean c() {
        return this.K;
    }

    @Override // b3.m
    public final void y() {
        this.J = true;
    }
}
