package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class n1 implements d0, c0 {
    public final d0 a;
    public final long b;
    public c0 c;

    public n1(d0 d0Var, long j3) {
        this.a = d0Var;
        this.b = j3;
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i7 = 0;
        while (true) {
            b1 b1Var = null;
            if (i7 >= b1VarArr.length) {
                break;
            }
            m1 m1Var = (m1) b1VarArr[i7];
            if (m1Var != null) {
                b1Var = m1Var.a;
            }
            b1VarArr2[i7] = b1Var;
            i7++;
        }
        d0 d0Var = this.a;
        long j10 = this.b;
        long b10 = d0Var.b(uVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var2 = b1VarArr2[i10];
            if (b1Var2 == null) {
                b1VarArr[i10] = null;
            } else {
                b1 b1Var3 = b1VarArr[i10];
                if (b1Var3 == null || ((m1) b1Var3).a != b1Var2) {
                    b1VarArr[i10] = new m1(b1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override // x2.d1
    public final boolean c(l2.s0 s0Var) {
        l2.r0 r0Var = new l2.r0();
        long j3 = s0Var.a;
        r0Var.b = s0Var.b;
        r0Var.c = s0Var.c;
        r0Var.a = j3 - this.b;
        return this.a.c(new l2.s0(r0Var));
    }

    @Override // x2.d1
    public final long e() {
        long e10 = this.a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.b;
    }

    @Override // x2.c1
    public final void f0(d1 d1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.f0(this);
    }

    @Override // x2.d1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.d0
    public final long h(long j3, l2.p1 p1Var) {
        long j10 = this.b;
        return this.a.h(j3 - j10, p1Var) + j10;
    }

    @Override // x2.d0
    public final void i() {
        this.a.i();
    }

    @Override // x2.d0
    public final long j(long j3) {
        long j10 = this.b;
        return this.a.j(j3 - j10) + j10;
    }

    @Override // x2.c0
    public final void k(d0 d0Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.k(this);
    }

    @Override // x2.d0
    public final void l(long j3) {
        this.a.l(j3 - this.b);
    }

    @Override // x2.d0
    public final long o() {
        long o4 = this.a.o();
        if (o4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o4 + this.b;
    }

    @Override // x2.d0
    public final q1 p() {
        return this.a.p();
    }

    @Override // x2.d1
    public final long s() {
        long s5 = this.a.s();
        if (s5 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s5 + this.b;
    }

    @Override // x2.d0
    public final void t(c0 c0Var, long j3) {
        this.c = c0Var;
        this.a.t(this, j3 - this.b);
    }

    @Override // x2.d1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }
}
