package x2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class p1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public p1(e0 e0Var, long j3) {
        this.a = e0Var;
        this.b = j3;
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i7 = 0;
        while (true) {
            d1 d1Var = null;
            if (i7 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i7];
            if (o1Var != null) {
                d1Var = o1Var.a;
            }
            d1VarArr2[i7] = d1Var;
            i7++;
        }
        e0 e0Var = this.a;
        long j10 = this.b;
        long b10 = e0Var.b(uVarArr, zArr, d1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            d1 d1Var2 = d1VarArr2[i10];
            if (d1Var2 == null) {
                d1VarArr[i10] = null;
            } else {
                d1 d1Var3 = d1VarArr[i10];
                if (d1Var3 == null || ((o1) d1Var3).a != d1Var2) {
                    d1VarArr[i10] = new o1(d1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        l2.r0 r0Var = new l2.r0();
        long j3 = s0Var.a;
        r0Var.b = s0Var.b;
        r0Var.c = s0Var.c;
        r0Var.a = j3 - this.b;
        return this.a.c(new l2.s0(r0Var));
    }

    @Override // x2.e1
    public final void c0(f1 f1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.c0(this);
    }

    @Override // x2.f1
    public final long e() {
        long e10 = this.a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.b;
    }

    @Override // x2.e0
    public final long f(long j3, l2.p1 p1Var) {
        long j10 = this.b;
        return this.a.f(j3 - j10, p1Var) + j10;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.e0
    public final void i() {
        this.a.i();
    }

    @Override // x2.e0
    public final long k(long j3) {
        long j10 = this.b;
        return this.a.k(j3 - j10) + j10;
    }

    @Override // x2.d0
    public final void m(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.m(this);
    }

    @Override // x2.e0
    public final void n(long j3) {
        this.a.n(j3 - this.b);
    }

    @Override // x2.e0
    public final long o() {
        long o4 = this.a.o();
        if (o4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o4 + this.b;
    }

    @Override // x2.e0
    public final r1 q() {
        return this.a.q();
    }

    @Override // x2.f1
    public final long r() {
        long r10 = this.a.r();
        if (r10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r10 + this.b;
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        this.c = d0Var;
        this.a.t(this, j3 - this.b);
    }

    @Override // x2.f1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }
}
