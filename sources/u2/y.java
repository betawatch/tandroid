package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y implements e0, d0 {
    public final g0 a;
    public final long b;
    public final y2.d c;
    public a d;
    public e0 e;
    public d0 f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, y2.d dVar, long j3) {
        this.a = g0Var;
        this.c = dVar;
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
            c10.j(this, j3);
        }
    }

    @Override // u2.d0
    public final void b(e0 e0Var) {
        d0 d0Var = this.f;
        String str = e2.d0.a;
        d0Var.b(this);
    }

    @Override // u2.f1
    public final boolean c() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c();
    }

    @Override // u2.f1
    public final long d() {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.d();
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

    @Override // u2.e1
    public final void g(f1 f1Var) {
        d0 d0Var = this.f;
        String str = e2.d0.a;
        d0Var.g(this);
    }

    @Override // u2.e0
    public final long h(long j3) {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.h(j3);
    }

    @Override // u2.e0
    public final void i(long j3) {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        e0Var.i(j3);
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j3) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            e0Var.j(this, j10);
        }
    }

    @Override // u2.e0
    public final long m() {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.m();
    }

    @Override // u2.f1
    public final boolean n(i2.q0 q0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.n(q0Var);
    }

    @Override // u2.e0
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.o(rVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override // u2.e0
    public final q1 q() {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.q();
    }

    @Override // u2.f1
    public final long r() {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.r();
    }

    @Override // u2.e0
    public final long s(long j3, i2.o1 o1Var) {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        return e0Var.s(j3, o1Var);
    }

    @Override // u2.f1
    public final void u(long j3) {
        e0 e0Var = this.e;
        String str = e2.d0.a;
        e0Var.u(j3);
    }
}
