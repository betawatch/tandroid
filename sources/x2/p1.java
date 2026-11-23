package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public p1(e0 e0Var, long j3) {
        this.a = e0Var;
        this.b = j3;
    }

    @Override // x2.d0
    public final void V(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.V(this);
    }

    @Override // x2.e0
    public final long c(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
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
        long c10 = e0Var.c(uVarArr, zArr, d1VarArr2, zArr2, j3 - j10);
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
        return c10 + j10;
    }

    @Override // x2.f1
    public final boolean d(l2.t0 t0Var) {
        l2.s0 s0Var = new l2.s0();
        long j3 = t0Var.a;
        s0Var.b = t0Var.b;
        s0Var.c = t0Var.c;
        s0Var.a = j3 - this.b;
        return this.a.d(new l2.t0(s0Var));
    }

    @Override // x2.f1
    public final long f() {
        long f10 = this.a.f();
        if (f10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f10 + this.b;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.e0
    public final long i(long j3, l2.q1 q1Var) {
        long j10 = this.b;
        return this.a.i(j3 - j10, q1Var) + j10;
    }

    @Override // x2.e1
    public final void i2(f1 f1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.i2(this);
    }

    @Override // x2.e0
    public final void j() {
        this.a.j();
    }

    @Override // x2.e0
    public final long l(long j3) {
        long j10 = this.b;
        return this.a.l(j3 - j10) + j10;
    }

    @Override // x2.e0
    public final void n(long j3) {
        this.a.n(j3 - this.b);
    }

    @Override // x2.e0
    public final long p() {
        long p10 = this.a.p();
        if (p10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return p10 + this.b;
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
    public final void s(d0 d0Var, long j3) {
        this.c = d0Var;
        this.a.s(this, j3 - this.b);
    }

    @Override // x2.f1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }
}
