package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public p1(e0 e0Var, long j10) {
        this.a = e0Var;
        this.b = j10;
    }

    @Override // w2.d0
    public final void b(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        k2.u0 u0Var = new k2.u0();
        long j10 = v0Var.a;
        u0Var.b = v0Var.b;
        u0Var.c = v0Var.c;
        u0Var.a = j10 - this.b;
        return this.a.c(new k2.v0(u0Var));
    }

    @Override // w2.f1
    public final boolean d() {
        return this.a.d();
    }

    @Override // w2.f1
    public final long e() {
        long e10 = this.a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.b;
    }

    @Override // w2.e0
    public final void g() {
        this.a.g();
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        this.c = d0Var;
        this.a.i(this, j10 - this.b);
    }

    @Override // w2.e0
    public final long j(long j10) {
        long j11 = this.b;
        return this.a.j(j10 - j11) + j11;
    }

    @Override // w2.e1
    public final void k(f1 f1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override // w2.e0
    public final void l(long j10) {
        this.a.l(j10 - this.b);
    }

    @Override // w2.e0
    public final long n() {
        long n4 = this.a.n();
        if (n4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n4 + this.b;
    }

    @Override // w2.e0
    public final r1 p() {
        return this.a.p();
    }

    @Override // w2.f1
    public final long q() {
        long q10 = this.a.q();
        if (q10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return q10 + this.b;
    }

    @Override // w2.e0
    public final long r(long j10, k2.t1 t1Var) {
        long j11 = this.b;
        return this.a.r(j10 - j11, t1Var) + j11;
    }

    @Override // w2.e0
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i3 = 0;
        while (true) {
            d1 d1Var = null;
            if (i3 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i3];
            if (o1Var != null) {
                d1Var = o1Var.a;
            }
            d1VarArr2[i3] = d1Var;
            i3++;
        }
        e0 e0Var = this.a;
        long j11 = this.b;
        long s6 = e0Var.s(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            d1 d1Var2 = d1VarArr2[i10];
            if (d1Var2 == null) {
                d1VarArr[i10] = null;
            } else {
                d1 d1Var3 = d1VarArr[i10];
                if (d1Var3 == null || ((o1) d1Var3).a != d1Var2) {
                    d1VarArr[i10] = new o1(d1Var2, j11);
                }
            }
        }
        return s6 + j11;
    }

    @Override // w2.f1
    public final void t(long j10) {
        this.a.t(j10 - this.b);
    }
}
