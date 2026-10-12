package u2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class p1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public p1(e0 e0Var, long j10) {
        this.a = e0Var;
        this.b = j10;
    }

    @Override // u2.e1
    public final void G(f1 f1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.G(this);
    }

    @Override // u2.f1
    public final long b() {
        long b10 = this.a.b();
        if (b10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b10 + this.b;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.e0
    public final void g() {
        this.a.g();
    }

    @Override // u2.e0
    public final long h(long j10) {
        long j11 = this.b;
        return this.a.h(j10 - j11) + j11;
    }

    @Override // u2.e0
    public final void i(long j10) {
        this.a.i(j10 - this.b);
    }

    @Override // u2.e0
    public final void n(d0 d0Var, long j10) {
        this.c = d0Var;
        this.a.n(this, j10 - this.b);
    }

    @Override // u2.e0
    public final long o() {
        long o10 = this.a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.b;
    }

    @Override // u2.f1
    public final boolean p(i2.v0 v0Var) {
        i2.u0 u0Var = new i2.u0();
        long j10 = v0Var.a;
        u0Var.b = v0Var.b;
        u0Var.c = v0Var.c;
        u0Var.a = j10 - this.b;
        return this.a.p(new i2.v0(u0Var));
    }

    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i10 = 0;
        while (true) {
            d1 d1Var = null;
            if (i10 >= d1VarArr.length) {
                break;
            }
            o1 o1Var = (o1) d1VarArr[i10];
            if (o1Var != null) {
                d1Var = o1Var.a;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        e0 e0Var = this.a;
        long j11 = this.b;
        long q6 = e0Var.q(pVarArr, zArr, d1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override // u2.e0
    public final r1 r() {
        return this.a.r();
    }

    @Override // u2.f1
    public final long s() {
        long s10 = this.a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.b;
    }

    @Override // u2.e0
    public final long t(long j10, i2.t1 t1Var) {
        long j11 = this.b;
        return this.a.t(j10 - j11, t1Var) + j11;
    }

    @Override // u2.f1
    public final void u(long j10) {
        this.a.u(j10 - this.b);
    }

    @Override // u2.d0
    public final void y(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.y(this);
    }
}
