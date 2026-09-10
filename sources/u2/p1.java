package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public p1(e0 e0Var, long j3) {
        this.a = e0Var;
        this.b = j3;
    }

    @Override // u2.d0
    public final void b(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override // u2.f1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.f1
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // u2.e0
    public final void f() {
        this.a.f();
    }

    @Override // u2.e1
    public final void g(f1 f1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override // u2.e0
    public final long h(long j3) {
        long j10 = this.b;
        return this.a.h(j3 - j10) + j10;
    }

    @Override // u2.e0
    public final void i(long j3) {
        this.a.i(j3 - this.b);
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j3) {
        this.c = d0Var;
        this.a.j(this, j3 - this.b);
    }

    @Override // u2.e0
    public final long m() {
        long m10 = this.a.m();
        if (m10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m10 + this.b;
    }

    @Override // u2.f1
    public final boolean n(i2.q0 q0Var) {
        i2.p0 p0Var = new i2.p0();
        long j3 = q0Var.a;
        p0Var.b = q0Var.b;
        p0Var.c = q0Var.c;
        p0Var.a = j3 - this.b;
        return this.a.n(new i2.q0(p0Var));
    }

    @Override // u2.e0
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
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
        long j10 = this.b;
        long o9 = e0Var.o(rVarArr, zArr, d1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                d1VarArr[i11] = null;
            } else {
                d1 d1Var3 = d1VarArr[i11];
                if (d1Var3 == null || ((o1) d1Var3).a != d1Var2) {
                    d1VarArr[i11] = new o1(d1Var2, j10);
                }
            }
        }
        return o9 + j10;
    }

    @Override // u2.e0
    public final q1 q() {
        return this.a.q();
    }

    @Override // u2.f1
    public final long r() {
        long r10 = this.a.r();
        if (r10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r10 + this.b;
    }

    @Override // u2.e0
    public final long s(long j3, i2.o1 o1Var) {
        long j10 = this.b;
        return this.a.s(j3 - j10, o1Var) + j10;
    }

    @Override // u2.f1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }
}
