package x2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public final void a(g0 g0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        e0 c10 = aVar.c(g0Var, this.c, j3);
        this.e = c10;
        if (this.f != null) {
            c10.t(this, j3);
        }
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.b(uVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c(s0Var);
    }

    @Override // x2.e1
    public final void c0(f1 f1Var) {
        d0 d0Var = this.f;
        String str = h2.l0.a;
        d0Var.c0(this);
    }

    @Override // x2.f1
    public final long e() {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.e();
    }

    @Override // x2.e0
    public final long f(long j3, l2.p1 p1Var) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.f(j3, p1Var);
    }

    @Override // x2.f1
    public final boolean g() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.g();
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
    public final long k(long j3) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.k(j3);
    }

    @Override // x2.d0
    public final void m(e0 e0Var) {
        d0 d0Var = this.f;
        String str = h2.l0.a;
        d0Var.m(this);
    }

    @Override // x2.e0
    public final void n(long j3) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        e0Var.n(j3);
    }

    @Override // x2.e0
    public final long o() {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.o();
    }

    @Override // x2.e0
    public final r1 q() {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.q();
    }

    @Override // x2.f1
    public final long r() {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.r();
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            e0Var.t(this, j10);
        }
    }

    @Override // x2.f1
    public final void u(long j3) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        e0Var.u(j3);
    }
}
