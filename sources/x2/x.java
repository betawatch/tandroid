package x2;

import l2.t1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    @Override // x2.c0
    public final void a(d0 d0Var) {
        c0 c0Var = this.f;
        String str = h2.m0.a;
        c0Var.a(this);
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = h2.m0.a;
        return d0Var.b(uVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override // x2.d1
    public final boolean c(l2.v0 v0Var) {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.c(v0Var);
    }

    @Override // x2.c1
    public final void d(d1 d1Var) {
        c0 c0Var = this.f;
        String str = h2.m0.a;
        c0Var.d(this);
    }

    @Override // x2.d1
    public final long e() {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        return d0Var.e();
    }

    public final void f(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.c, j3);
        this.e = c10;
        if (this.f != null) {
            c10.q(this, j3);
        }
    }

    @Override // x2.d1
    public final boolean g() {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.g();
    }

    @Override // x2.d0
    public final long h(long j3, t1 t1Var) {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        return d0Var.h(j3, t1Var);
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
        String str = h2.m0.a;
        return d0Var.j(j3);
    }

    @Override // x2.d0
    public final void k(long j3) {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        d0Var.k(j3);
    }

    @Override // x2.d0
    public final long n() {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        return d0Var.n();
    }

    @Override // x2.d0
    public final p1 o() {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        return d0Var.o();
    }

    @Override // x2.d1
    public final long p() {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        return d0Var.p();
    }

    @Override // x2.d0
    public final void q(c0 c0Var, long j3) {
        this.f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            d0Var.q(this, j10);
        }
    }

    @Override // x2.d1
    public final void r(long j3) {
        d0 d0Var = this.e;
        String str = h2.m0.a;
        d0Var.r(j3);
    }
}
