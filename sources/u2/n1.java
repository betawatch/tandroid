package u2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n1 implements d0, c0 {
    public final d0 a;
    public final long b;
    public c0 c;

    public n1(d0 d0Var, long j3) {
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
    public final void b(d1 d1Var) {
        c0 c0Var = this.c;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override // u2.d1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.d1
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // u2.d0
    public final void j() {
        this.a.j();
    }

    @Override // u2.d0
    public final long k(long j3) {
        long j10 = this.b;
        return this.a.k(j3 - j10) + j10;
    }

    @Override // u2.d0
    public final void l(long j3) {
        this.a.l(j3 - this.b);
    }

    @Override // u2.d0
    public final void n(c0 c0Var, long j3) {
        this.c = c0Var;
        this.a.n(this, j3 - this.b);
    }

    @Override // u2.d0
    public final long o() {
        long o9 = this.a.o();
        if (o9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o9 + this.b;
    }

    @Override // u2.d1
    public final boolean p(i2.r0 r0Var) {
        i2.q0 q0Var = new i2.q0();
        long j3 = r0Var.a;
        q0Var.b = r0Var.b;
        q0Var.c = r0Var.c;
        q0Var.a = j3 - this.b;
        return this.a.p(new i2.r0(q0Var));
    }

    @Override // u2.d0
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            m1 m1Var = (m1) b1VarArr[i10];
            if (m1Var != null) {
                b1Var = m1Var.a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        d0 d0Var = this.a;
        long j10 = this.b;
        long q6 = d0Var.q(rVarArr, zArr, b1VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < b1VarArr.length; i11++) {
            b1 b1Var2 = b1VarArr2[i11];
            if (b1Var2 == null) {
                b1VarArr[i11] = null;
            } else {
                b1 b1Var3 = b1VarArr[i11];
                if (b1Var3 == null || ((m1) b1Var3).a != b1Var2) {
                    b1VarArr[i11] = new m1(b1Var2, j10);
                }
            }
        }
        return q6 + j10;
    }

    @Override // u2.d0
    public final o1 r() {
        return this.a.r();
    }

    @Override // u2.d1
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

    @Override // u2.d1
    public final void u(long j3) {
        this.a.u(j3 - this.b);
    }
}
