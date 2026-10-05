package u2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class o1 implements d0, c0 {
    public final d0 a;
    public final long b;
    public c0 c;

    public o1(d0 d0Var, long j3) {
        this.a = d0Var;
        this.b = j3;
    }

    @Override // u2.c0
    public final void b(d0 d0Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.b(this);
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

    @Override // u2.d1
    public final void f(e1 e1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.f(this);
    }

    @Override // u2.d0
    public final void g() {
        this.a.g();
    }

    @Override // u2.d0
    public final long h(long j3) {
        long j10 = this.b;
        return this.a.h(j3 - j10) + j10;
    }

    @Override // u2.d0
    public final void i(long j3) {
        this.a.i(j3 - this.b);
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        this.c = c0Var;
        this.a.k(this, j3 - this.b);
    }

    @Override // u2.d0
    public final long l() {
        long l4 = this.a.l();
        if (l4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l4 + this.b;
    }

    @Override // u2.e1
    public final boolean m(i2.s0 s0Var) {
        i2.r0 r0Var = new i2.r0();
        long j3 = s0Var.a;
        r0Var.b = s0Var.b;
        r0Var.c = s0Var.c;
        r0Var.a = j3 - this.b;
        return this.a.m(new i2.s0(r0Var));
    }

    @Override // u2.d0
    public final long n(x2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
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
        long j10 = this.b;
        long n10 = d0Var.n(rVarArr, zArr, c1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((n1) c1Var3).a != c1Var2) {
                    c1VarArr[i11] = new n1(c1Var2, j10);
                }
            }
        }
        return n10 + j10;
    }

    @Override // u2.d0
    public final p1 o() {
        return this.a.o();
    }

    @Override // u2.e1
    public final long p() {
        long p5 = this.a.p();
        if (p5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p5 + this.b;
    }

    @Override // u2.d0
    public final long q(long j3, i2.q1 q1Var) {
        long j10 = this.b;
        return this.a.q(j3 - j10, q1Var) + j10;
    }

    @Override // u2.e1
    public final void r(long j3) {
        this.a.r(j3 - this.b);
    }
}
