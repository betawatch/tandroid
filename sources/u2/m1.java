package u2;

import i2.q1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class m1 implements d0, c0 {
    public final d0 a;
    public final long b;
    public c0 c;

    public m1(d0 d0Var, long j3) {
        this.a = d0Var;
        this.b = j3;
    }

    @Override // u2.c0
    public final void a(d0 d0Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override // u2.c1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.c1
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

    @Override // u2.c1
    public final boolean m(i2.s0 s0Var) {
        i2.r0 r0Var = new i2.r0();
        long j3 = s0Var.a;
        r0Var.b = s0Var.b;
        r0Var.c = s0Var.c;
        r0Var.a = j3 - this.b;
        return this.a.m(new i2.s0(r0Var));
    }

    @Override // u2.d0
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        int i10 = 0;
        while (true) {
            a1 a1Var = null;
            if (i10 >= a1VarArr.length) {
                break;
            }
            l1 l1Var = (l1) a1VarArr[i10];
            if (l1Var != null) {
                a1Var = l1Var.a;
            }
            a1VarArr2[i10] = a1Var;
            i10++;
        }
        d0 d0Var = this.a;
        long j10 = this.b;
        long p5 = d0Var.p(rVarArr, zArr, a1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            a1 a1Var2 = a1VarArr2[i11];
            if (a1Var2 == null) {
                a1VarArr[i11] = null;
            } else {
                a1 a1Var3 = a1VarArr[i11];
                if (a1Var3 == null || ((l1) a1Var3).a != a1Var2) {
                    a1VarArr[i11] = new l1(a1Var2, j10);
                }
            }
        }
        return p5 + j10;
    }

    @Override // u2.d0
    public final n1 r() {
        return this.a.r();
    }

    @Override // u2.c1
    public final long s() {
        long s10 = this.a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.b;
    }

    @Override // u2.d0
    public final long t(long j3, q1 q1Var) {
        long j10 = this.b;
        return this.a.t(j3 - j10, q1Var) + j10;
    }

    @Override // u2.c1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }

    @Override // u2.b1
    public final void v(c1 c1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.v(this);
    }
}
