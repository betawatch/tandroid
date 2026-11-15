package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class x implements d0, c0 {
    public final f0 a;
    public final long b;
    public final h6.m c;
    public a d;
    public d0 e;
    public c0 f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, h6.m mVar, long j3) {
        this.a = f0Var;
        this.c = mVar;
        this.b = j3;
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.c, j3);
        this.e = c10;
        if (this.f != null) {
            c10.t(this, j3);
        }
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.b(uVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override // x2.d1
    public final boolean c(l2.s0 s0Var) {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.c(s0Var);
    }

    @Override // x2.d1
    public final long e() {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.e();
    }

    @Override // x2.c1
    public final void f0(d1 d1Var) {
        c0 c0Var = this.f;
        String str = h2.l0.a;
        c0Var.f0(this);
    }

    @Override // x2.d1
    public final boolean g() {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.g();
    }

    @Override // x2.d0
    public final long h(long j3, l2.p1 p1Var) {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.h(j3, p1Var);
    }

    @Override // x2.d0
    public final void i() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            d0Var.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // x2.d0
    public final long j(long j3) {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.j(j3);
    }

    @Override // x2.c0
    public final void k(d0 d0Var) {
        c0 c0Var = this.f;
        String str = h2.l0.a;
        c0Var.k(this);
    }

    @Override // x2.d0
    public final void l(long j3) {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        d0Var.l(j3);
    }

    @Override // x2.d0
    public final long o() {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.o();
    }

    @Override // x2.d0
    public final q1 p() {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.p();
    }

    @Override // x2.d1
    public final long s() {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        return d0Var.s();
    }

    @Override // x2.d0
    public final void t(c0 c0Var, long j3) {
        this.f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            d0Var.t(this, j10);
        }
    }

    @Override // x2.d1
    public final void u(long j3) {
        d0 d0Var = this.e;
        String str = h2.l0.a;
        d0Var.u(j3);
    }
}
