package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class x implements d0, c0 {
    public final f0 a;
    public final long b;
    public final androidx.biometric.e c;
    public a d;
    public d0 e;
    public c0 f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, androidx.biometric.e eVar, long j10) {
        this.a = f0Var;
        this.c = eVar;
        this.b = j10;
    }

    public final void a(f0 f0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.c, j10);
        this.e = c10;
        if (this.f != null) {
            c10.m(this, j10);
        }
    }

    @Override // u2.e1
    public final boolean c() {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.c();
    }

    @Override // u2.e1
    public final long d() {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.d();
    }

    @Override // u2.d0
    public final void g() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            d0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // u2.c0
    public final void h(d0 d0Var) {
        c0 c0Var = this.f;
        String str = e2.m0.a;
        c0Var.h(this);
    }

    @Override // u2.d0
    public final long i(long j10) {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.i(j10);
    }

    @Override // u2.d0
    public final void k(long j10) {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        d0Var.k(j10);
    }

    @Override // u2.d0
    public final void m(c0 c0Var, long j10) {
        this.f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            d0Var.m(this, j11);
        }
    }

    @Override // u2.d0
    public final long o() {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.o();
    }

    @Override // u2.e1
    public final boolean p(i2.u0 u0Var) {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.p(u0Var);
    }

    @Override // u2.d0
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.q(pVarArr, zArr, c1VarArr, zArr2, j12);
    }

    @Override // u2.d0
    public final q1 r() {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.r();
    }

    @Override // u2.e1
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.s();
    }

    @Override // u2.d0
    public final long t(long j10, i2.r1 r1Var) {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        return d0Var.t(j10, r1Var);
    }

    @Override // u2.e1
    public final void u(long j10) {
        d0 d0Var = this.e;
        String str = e2.m0.a;
        d0Var.u(j10);
    }

    @Override // u2.d1
    public final void v(e1 e1Var) {
        c0 c0Var = this.f;
        String str = e2.m0.a;
        c0Var.v(this);
    }
}
