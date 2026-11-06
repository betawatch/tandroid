package x2;

import l2.t1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class o1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public o1(e0 e0Var, long j3) {
        this.a = e0Var;
        this.b = j3;
    }

    @Override // x2.d0
    public final void a(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i7 = 0;
        while (true) {
            c1 c1Var = null;
            if (i7 >= c1VarArr.length) {
                break;
            }
            n1 n1Var = (n1) c1VarArr[i7];
            if (n1Var != null) {
                c1Var = n1Var.a;
            }
            c1VarArr2[i7] = c1Var;
            i7++;
        }
        e0 e0Var = this.a;
        long j10 = this.b;
        long b10 = e0Var.b(uVarArr, zArr, c1VarArr2, zArr2, j3 - j10);
        for (int i10 = 0; i10 < c1VarArr.length; i10++) {
            c1 c1Var2 = c1VarArr2[i10];
            if (c1Var2 == null) {
                c1VarArr[i10] = null;
            } else {
                c1 c1Var3 = c1VarArr[i10];
                if (c1Var3 == null || ((n1) c1Var3).a != c1Var2) {
                    c1VarArr[i10] = new n1(c1Var2, j10);
                }
            }
        }
        return b10 + j10;
    }

    @Override // x2.e1
    public final boolean c(l2.v0 v0Var) {
        l2.u0 u0Var = new l2.u0();
        long j3 = v0Var.a;
        u0Var.b = v0Var.b;
        u0Var.c = v0Var.c;
        u0Var.a = j3 - this.b;
        return this.a.c(new l2.v0(u0Var));
    }

    @Override // x2.d1
    public final void d(e1 e1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.d(this);
    }

    @Override // x2.e1
    public final long e() {
        long e10 = this.a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.b;
    }

    @Override // x2.e1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.e0
    public final long h(long j3, t1 t1Var) {
        long j10 = this.b;
        return this.a.h(j3 - j10, t1Var) + j10;
    }

    @Override // x2.e0
    public final void i() {
        this.a.i();
    }

    @Override // x2.e0
    public final long j(long j3) {
        long j10 = this.b;
        return this.a.j(j3 - j10) + j10;
    }

    @Override // x2.e0
    public final void k(long j3) {
        this.a.k(j3 - this.b);
    }

    @Override // x2.e0
    public final long n() {
        long n10 = this.a.n();
        if (n10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n10 + this.b;
    }

    @Override // x2.e0
    public final q1 o() {
        return this.a.o();
    }

    @Override // x2.e1
    public final long p() {
        long p10 = this.a.p();
        if (p10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p10 + this.b;
    }

    @Override // x2.e0
    public final void q(d0 d0Var, long j3) {
        this.c = d0Var;
        this.a.q(this, j3 - this.b);
    }

    @Override // x2.e1
    public final void r(long j3) {
        this.a.r(j3 - this.b);
    }
}
