package u2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class y implements e0, d0 {
    public final g0 a;
    public final long b;
    public final androidx.biometric.e c;
    public a d;
    public e0 e;
    public d0 f;
    public long h = -9223372036854775807L;

    public y(g0 g0Var, androidx.biometric.e eVar, long j10) {
        this.a = g0Var;
        this.c = eVar;
        this.b = j10;
    }

    @Override // u2.e1
    public final void G(f1 f1Var) {
        d0 d0Var = this.f;
        String str = e2.m0.a;
        d0Var.G(this);
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
            c10.n(this, j10);
        }
    }

    @Override // u2.f1
    public final long b() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.b();
    }

    @Override // u2.f1
    public final boolean c() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c();
    }

    @Override // u2.e0
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

    @Override // u2.e0
    public final long h(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.h(j10);
    }

    @Override // u2.e0
    public final void i(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        e0Var.i(j10);
    }

    @Override // u2.e0
    public final void n(d0 d0Var, long j10) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            e0Var.n(this, j11);
        }
    }

    @Override // u2.e0
    public final long o() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.o();
    }

    @Override // u2.f1
    public final boolean p(i2.v0 v0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.p(v0Var);
    }

    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.q(pVarArr, zArr, d1VarArr, zArr2, j12);
    }

    @Override // u2.e0
    public final r1 r() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.r();
    }

    @Override // u2.f1
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.s();
    }

    @Override // u2.e0
    public final long t(long j10, i2.t1 t1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.t(j10, t1Var);
    }

    @Override // u2.f1
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        e0Var.u(j10);
    }

    @Override // u2.d0
    public final void y(e0 e0Var) {
        d0 d0Var = this.f;
        String str = e2.m0.a;
        d0Var.y(this);
    }
}
