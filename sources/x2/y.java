package x2;

import l2.t1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class y implements e0, d0 {
    public final g0 a;
    public final long b;
    public final h6.m c;
    public a d;
    public e0 e;
    public d0 f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, h6.m mVar, long j3) {
        this.a = g0Var;
        this.c = mVar;
        this.b = j3;
    }

    @Override // x2.d0
    public final void a(e0 e0Var) {
        d0 d0Var = this.f;
        String str = h2.m0.a;
        d0Var.a(this);
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.b(uVarArr, zArr, c1VarArr, zArr2, j11);
    }

    @Override // x2.e1
    public final boolean c(l2.v0 v0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c(v0Var);
    }

    @Override // x2.d1
    public final void d(e1 e1Var) {
        d0 d0Var = this.f;
        String str = h2.m0.a;
        d0Var.d(this);
    }

    @Override // x2.e1
    public final long e() {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.e();
    }

    public final void f(g0 g0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.c, j3);
        this.e = c10;
        if (this.f != null) {
            c10.q(this, j3);
        }
    }

    @Override // x2.e1
    public final boolean g() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.g();
    }

    @Override // x2.e0
    public final long h(long j3, t1 t1Var) {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.h(j3, t1Var);
    }

    @Override // x2.e0
    public final void i() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // x2.e0
    public final long j(long j3) {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.j(j3);
    }

    @Override // x2.e0
    public final void k(long j3) {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        e0Var.k(j3);
    }

    @Override // x2.e0
    public final long n() {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.n();
    }

    @Override // x2.e0
    public final q1 o() {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.o();
    }

    @Override // x2.e1
    public final long p() {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        return e0Var.p();
    }

    @Override // x2.e0
    public final void q(d0 d0Var, long j3) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            e0Var.q(this, j10);
        }
    }

    @Override // x2.e1
    public final void r(long j3) {
        e0 e0Var = this.e;
        String str = h2.m0.a;
        e0Var.r(j3);
    }
}
