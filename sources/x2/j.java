package x2;

import b8.uc;
import b8.zb;
import d2.u0;
import d2.v;
import e3.i0;
import g2.y;
import i2.c0;
import w2.c1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends a {
    public final int F;
    public final long G;
    public final e H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public j(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, long j10, long j11, long j12, long j13, long j14, int i10, long j15, e eVar) {
        super(hVar, nVar, vVar, i3, obj, j10, j11, j12, j13, j14);
        this.F = i10;
        this.G = j15;
        this.H = eVar;
    }

    @Override // a3.m
    public final void X1() {
        this.J = true;
    }

    @Override // a3.m
    public final void a() {
        ua.b bVar = this.y;
        bVar.getClass();
        if (this.I == 0) {
            long j10 = this.G;
            for (c1 c1Var : (c1[]) bVar.c) {
                if (c1Var.H != j10) {
                    c1Var.H = j10;
                    c1Var.B = true;
                }
            }
            e eVar = this.H;
            long j11 = this.w;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.G;
            long j13 = this.x;
            eVar.b(bVar, j12, j13 != -9223372036854775807L ? j13 - this.G : -9223372036854775807L);
        }
        try {
            i2.n b10 = this.b.b(this.I);
            c0 c0Var = this.r;
            e3.l lVar = new e3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.J) {
                try {
                    int f10 = this.H.a.f(lVar, e.w);
                    zb.p(f10 != 1);
                    if (!(f10 == 0)) {
                        break;
                    }
                } finally {
                    this.I = lVar.d - this.b.e;
                }
            }
            v vVar = this.d;
            String str = vVar.r;
            int i3 = vVar.R;
            int i10 = vVar.S;
            if (u0.k(str) && ((i3 > 1 || i10 > 1) && i3 != -1 && i10 != -1)) {
                i0 c2 = bVar.c(4);
                int i11 = i3 * i10;
                long j14 = (this.n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    c2.e(0, new y());
                    c2.d(i12 * j14, 0, 0, 0, null);
                }
            }
            uc.a(this.r);
            this.K = !this.J;
        } catch (Throwable th2) {
            uc.a(this.r);
            throw th2;
        }
    }

    @Override // x2.l
    public final long b() {
        return this.s + this.F;
    }

    @Override // x2.l
    public final boolean c() {
        return this.K;
    }
}
