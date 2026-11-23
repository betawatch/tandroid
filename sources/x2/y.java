package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final void V(e0 e0Var) {
        d0 d0Var = this.f;
        String str = h2.l0.a;
        d0Var.V(this);
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
            c10.s(this, j3);
        }
    }

    @Override // x2.e0
    public final long c(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.c(uVarArr, zArr, d1VarArr, zArr2, j11);
    }

    @Override // x2.f1
    public final boolean d(l2.t0 t0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.d(t0Var);
    }

    @Override // x2.f1
    public final long f() {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.f();
    }

    @Override // x2.f1
    public final boolean g() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.g();
    }

    @Override // x2.e0
    public final long i(long j3, l2.q1 q1Var) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.i(j3, q1Var);
    }

    @Override // x2.e1
    public final void i2(f1 f1Var) {
        d0 d0Var = this.f;
        String str = h2.l0.a;
        d0Var.i2(this);
    }

    @Override // x2.e0
    public final void j() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.j();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // x2.e0
    public final long l(long j3) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.l(j3);
    }

    @Override // x2.e0
    public final void n(long j3) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        e0Var.n(j3);
    }

    @Override // x2.e0
    public final long p() {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        return e0Var.p();
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
    public final void s(d0 d0Var, long j3) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            e0Var.s(this, j10);
        }
    }

    @Override // x2.f1
    public final void u(long j3) {
        e0 e0Var = this.e;
        String str = h2.l0.a;
        e0Var.u(j3);
    }
}
