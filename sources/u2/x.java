package u2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class x implements d0, c0 {
    public final f0 a;
    public final long b;
    public final y2.d c;
    public a d;
    public d0 e;
    public c0 f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.a = f0Var;
        this.c = dVar;
        this.b = j3;
    }

    @Override // u2.c0
    public final void a(d0 d0Var) {
        c0 c0Var = this.f;
        String str = e2.d0.a;
        c0Var.a(this);
    }

    @Override // u2.c1
    public final void b(d1 d1Var) {
        c0 c0Var = this.f;
        String str = e2.d0.a;
        c0Var.b(this);
    }

    @Override // u2.d1
    public final boolean c() {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.c();
    }

    @Override // u2.d1
    public final long d() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.d();
    }

    public final void e(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.c, j3);
        this.e = c10;
        if (this.f != null) {
            c10.n(this, j3);
        }
    }

    @Override // u2.d0
    public final void j() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            d0Var.j();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // u2.d0
    public final long k(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.k(j3);
    }

    @Override // u2.d0
    public final void l(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        d0Var.l(j3);
    }

    @Override // u2.d0
    public final void n(c0 c0Var, long j3) {
        this.f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            d0Var.n(this, j10);
        }
    }

    @Override // u2.d0
    public final long o() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.o();
    }

    @Override // u2.d1
    public final boolean p(i2.r0 r0Var) {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.p(r0Var);
    }

    @Override // u2.d0
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.q(rVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override // u2.d0
    public final o1 r() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.r();
    }

    @Override // u2.d1
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.s();
    }

    @Override // u2.d0
    public final long t(long j3, i2.p1 p1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.t(j3, p1Var);
    }

    @Override // u2.d1
    public final void u(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        d0Var.u(j3);
    }
}
