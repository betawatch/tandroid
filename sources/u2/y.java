package u2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final void F(f1 f1Var) {
        d0 d0Var = this.f;
        String str = e2.m0.a;
        d0Var.F(this);
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
            c10.k(this, j10);
        }
    }

    @Override // u2.f1
    public final boolean c() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c();
    }

    @Override // u2.f1
    public final long d() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.d();
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
    public final void k(d0 d0Var, long j10) {
        this.f = d0Var;
        e0 e0Var = this.e;
        if (e0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            e0Var.k(this, j11);
        }
    }

    @Override // u2.e0
    public final long l() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.l();
    }

    @Override // u2.f1
    public final boolean m(i2.v0 v0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.m(v0Var);
    }

    @Override // u2.e0
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.n(pVarArr, zArr, d1VarArr, zArr2, j12);
    }

    @Override // u2.e0
    public final r1 o() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.o();
    }

    @Override // u2.f1
    public final long p() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.p();
    }

    @Override // u2.d0
    public final void q(e0 e0Var) {
        d0 d0Var = this.f;
        String str = e2.m0.a;
        d0Var.q(this);
    }

    @Override // u2.e0
    public final long r(long j10, i2.t1 t1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.r(j10, t1Var);
    }

    @Override // u2.f1
    public final void s(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        e0Var.s(j10);
    }
}
