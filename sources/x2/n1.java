package x2;

import l2.t1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n1 implements d0, c0 {
    public final d0 a;
    public final long b;
    public c0 c;

    public n1(d0 d0Var, long j3) {
        this.a = d0Var;
        this.b = j3;
    }

    @Override // x2.c0
    public final void a(d0 d0Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.a(this);
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
    public final boolean c(l2.v0 v0Var) {
        l2.u0 u0Var = new l2.u0();
        long j3 = v0Var.a;
        u0Var.b = v0Var.b;
        u0Var.c = v0Var.c;
        u0Var.a = j3 - this.b;
        return this.a.c(new l2.v0(u0Var));
    }

    @Override // x2.c1
    public final void d(d1 d1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.d(this);
    }

    @Override // x2.d1
    public final long e() {
        long e10 = this.a.e();
        if (e10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e10 + this.b;
    }

    @Override // x2.d1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.d0
    public final long h(long j3, t1 t1Var) {
        long j10 = this.b;
        return this.a.h(j3 - j10, t1Var) + j10;
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

    @Override // x2.d0
    public final void k(long j3) {
        this.a.k(j3 - this.b);
    }

    @Override // x2.d0
    public final long n() {
        long n10 = this.a.n();
        if (n10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n10 + this.b;
    }

    @Override // x2.d0
    public final p1 o() {
        return this.a.o();
    }

    @Override // x2.d1
    public final long p() {
        long p10 = this.a.p();
        if (p10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p10 + this.b;
    }

    @Override // x2.d0
    public final void q(c0 c0Var, long j3) {
        this.c = c0Var;
        this.a.q(this, j3 - this.b);
    }

    @Override // x2.d1
    public final void r(long j3) {
        this.a.r(j3 - this.b);
    }
}
