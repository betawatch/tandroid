package u2;

import i2.q1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    @Override // u2.c1
    public final void D(d1 d1Var) {
        c0 c0Var = this.f;
        String str = e2.d0.a;
        c0Var.D(this);
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
            c10.k(this, j3);
        }
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

    @Override // u2.d0
    public final long h(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.h(j3);
    }

    @Override // u2.d0
    public final void i(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        d0Var.i(j3);
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        this.f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override // u2.d0
    public final long l() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.l();
    }

    @Override // u2.c0
    public final void m(d0 d0Var) {
        c0 c0Var = this.f;
        String str = e2.d0.a;
        c0Var.m(this);
    }

    @Override // u2.d1
    public final boolean n(i2.s0 s0Var) {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.n(s0Var);
    }

    @Override // u2.d0
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.o(rVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override // u2.d0
    public final o1 p() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.p();
    }

    @Override // u2.d1
    public final long q() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.q();
    }

    @Override // u2.d0
    public final long r(long j3, q1 q1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.r(j3, q1Var);
    }

    @Override // u2.d1
    public final void s(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        d0Var.s(j3);
    }
}
