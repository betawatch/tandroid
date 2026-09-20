package u2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    @Override // u2.d1
    public final void m(e1 e1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override // u2.e1
    public final boolean p(i2.r0 r0Var) {
        i2.q0 q0Var = new i2.q0();
        long j3 = r0Var.a;
        q0Var.b = r0Var.b;
        q0Var.c = r0Var.c;
        q0Var.a = j3 - this.b;
        return this.a.p(new i2.r0(q0Var));
    }

    @Override // u2.d0
    public final long q(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
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
        long q6 = d0Var.q(sVarArr, zArr, c1VarArr2, zArr2, j3 - j10);
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
        return q6 + j10;
    }

    @Override // u2.d0
    public final p1 r() {
        return this.a.r();
    }

    @Override // u2.e1
    public final long s() {
        long s10 = this.a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.b;
    }

    @Override // u2.d0
    public final long t(long j3, i2.p1 p1Var) {
        long j10 = this.b;
        return this.a.t(j3 - j10, p1Var) + j10;
    }

    @Override // u2.e1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }
}
