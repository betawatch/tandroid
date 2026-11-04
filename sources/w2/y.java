package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y implements e0, d0 {
    public final g0 a;
    public final long b;
    public final android.support.v4.media.session.a0 c;
    public a d;
    public e0 e;
    public d0 f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        this.a = g0Var;
        this.c = a0Var;
        this.b = j10;
    }

    public final void a(g0 g0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c2 = aVar.c(g0Var, this.c, j10);
        this.e = c2;
        if (this.f != null) {
            c2.i(this, j10);
        }
    }

    @Override // w2.d0
    public final void b(e0 e0Var) {
        d0 d0Var = this.f;
        String str = g2.n0.a;
        d0Var.b(this);
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c(v0Var);
    }

    @Override // w2.f1
    public final boolean d() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.d();
    }

    @Override // w2.f1
    public final long e() {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.e();
    }

    @Override // w2.e0
    public final void g() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            e0Var.i(this, j11);
        }
    }

    @Override // w2.e0
    public final long j(long j10) {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.j(j10);
    }

    @Override // w2.e1
    public final void k(f1 f1Var) {
        d0 d0Var = this.f;
        String str = g2.n0.a;
        d0Var.k(this);
    }

    @Override // w2.e0
    public final void l(long j10) {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        e0Var.l(j10);
    }

    @Override // w2.e0
    public final long n() {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.n();
    }

    @Override // w2.e0
    public final r1 p() {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.p();
    }

    @Override // w2.f1
    public final long q() {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.q();
    }

    @Override // w2.e0
    public final long r(long j10, k2.t1 t1Var) {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.r(j10, t1Var);
    }

    @Override // w2.e0
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = g2.n0.a;
        return e0Var.s(pVarArr, zArr, d1VarArr, zArr2, j12);
    }

    @Override // w2.f1
    public final void t(long j10) {
        e0 e0Var = this.e;
        String str = g2.n0.a;
        e0Var.t(j10);
    }
}
