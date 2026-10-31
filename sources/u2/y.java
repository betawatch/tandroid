package u2;

import i2.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        e0 c10 = aVar.c(g0Var, this.c, j10);
        this.e = c10;
        if (this.f != null) {
            c10.j(this, j10);
        }
    }

    @Override // u2.f1
    public final long c() {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.c();
    }

    @Override // u2.f1
    public final boolean d() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.d();
    }

    @Override // u2.d0
    public final void e(e0 e0Var) {
        d0 d0Var = this.f;
        String str = e2.l0.a;
        d0Var.e(this);
    }

    @Override // u2.e0
    public final void f() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.f();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // u2.e0
    public final long g(long j10) {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.g(j10);
    }

    @Override // u2.e0
    public final void h(long j10) {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        e0Var.h(j10);
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j10) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            e0Var.j(this, j11);
        }
    }

    @Override // u2.e0
    public final long k() {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.k();
    }

    @Override // u2.f1
    public final boolean m(i2.w0 w0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.m(w0Var);
    }

    @Override // u2.e0
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.p(qVarArr, zArr, d1VarArr, zArr2, j12);
    }

    @Override // u2.e0
    public final r1 q() {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.q();
    }

    @Override // u2.e1
    public final void r(f1 f1Var) {
        d0 d0Var = this.f;
        String str = e2.l0.a;
        d0Var.r(this);
    }

    @Override // u2.f1
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.s();
    }

    @Override // u2.e0
    public final long t(long j10, v1 v1Var) {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        return e0Var.t(j10, v1Var);
    }

    @Override // u2.f1
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.l0.a;
        e0Var.u(j10);
    }
}
