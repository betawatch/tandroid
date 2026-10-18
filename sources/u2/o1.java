package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o1 implements d0, c0 {
    public final d0 a;
    public final long b;
    public c0 c;

    public o1(d0 d0Var, long j10) {
        this.a = d0Var;
        this.b = j10;
    }

    @Override // u2.e1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.e1
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // u2.d0
    public final void g() {
        this.a.g();
    }

    @Override // u2.c0
    public final void h(d0 d0Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override // u2.d0
    public final long i(long j10) {
        long j11 = this.b;
        return this.a.i(j10 - j11) + j11;
    }

    @Override // u2.d0
    public final void k(long j10) {
        this.a.k(j10 - this.b);
    }

    @Override // u2.d0
    public final void m(c0 c0Var, long j10) {
        this.c = c0Var;
        this.a.m(this, j10 - this.b);
    }

    @Override // u2.d0
    public final long o() {
        long o10 = this.a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.b;
    }

    @Override // u2.e1
    public final boolean p(i2.u0 u0Var) {
        i2.t0 t0Var = new i2.t0();
        long j10 = u0Var.a;
        t0Var.b = u0Var.b;
        t0Var.c = u0Var.c;
        t0Var.a = j10 - this.b;
        return this.a.p(new i2.u0(t0Var));
    }

    @Override // u2.d0
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            n1 n1Var = (n1) c1VarArr[i10];
            if (n1Var != null) {
                c1Var = n1Var.a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        d0 d0Var = this.a;
        long j11 = this.b;
        long q6 = d0Var.q(pVarArr, zArr, c1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((n1) c1Var3).a != c1Var2) {
                    c1VarArr[i11] = new n1(c1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override // u2.d0
    public final q1 r() {
        return this.a.r();
    }

    @Override // u2.e1
    public final long s() {
        long s10 = this.a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.b;
    }

    @Override // u2.d0
    public final long t(long j10, i2.r1 r1Var) {
        long j11 = this.b;
        return this.a.t(j10 - j11, r1Var) + j11;
    }

    @Override // u2.e1
    public final void u(long j10) {
        this.a.u(j10 - this.b);
    }

    @Override // u2.d1
    public final void v(e1 e1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.v(this);
    }
}
