package u2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

    @Override // u2.d0
    public final void a(e0 e0Var) {
        d0 d0Var = this.f;
        String str = e2.m0.a;
        d0Var.a(this);
    }

    public final void b(g0 g0Var) {
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

    @Override // u2.g1
    public final boolean c() {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.c();
    }

    @Override // u2.g1
    public final long d() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.d();
    }

    @Override // u2.f1
    public final void h(g1 g1Var) {
        d0 d0Var = this.f;
        String str = e2.m0.a;
        d0Var.h(this);
    }

    @Override // u2.e0
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

    @Override // u2.e0
    public final long j(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.j(j10);
    }

    @Override // u2.e0
    public final void l(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        e0Var.l(j10);
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

    @Override // u2.g1
    public final boolean p(i2.v0 v0Var) {
        e0 e0Var = this.e;
        return e0Var != null && e0Var.p(v0Var);
    }

    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.q(pVarArr, zArr, e1VarArr, zArr2, j12);
    }

    @Override // u2.e0
    public final s1 r() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.r();
    }

    @Override // u2.g1
    public final long s() {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.s();
    }

    @Override // u2.e0
    public final long t(long j10, i2.s1 s1Var) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        return e0Var.t(j10, s1Var);
    }

    @Override // u2.g1
    public final void u(long j10) {
        e0 e0Var = this.e;
        String str = e2.m0.a;
        e0Var.u(j10);
    }
}
