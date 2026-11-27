// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rrb implements xt6, wt6 {
    public final xt6 a;
    public final long b;
    public wt6 c;

    public rrb(xt6 xt6Var, long j) {
        this.a = xt6Var;
        this.b = j;
    }

    @Override // wt6
    public final void a(xt6 xt6Var) {
        wt6 wt6Var = this.c;
        wt6Var.getClass();
        wt6Var.a(this);
    }

    @Override // xt6
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        at9[] at9VarArr2 = new at9[at9VarArr.length];
        int i = 0;
        while (true) {
            at9 at9Var = null;
            if (i >= at9VarArr.length) {
                break;
            }
            qrb qrbVar = (qrb) at9VarArr[i];
            if (qrbVar != null) {
                at9Var = qrbVar.a;
            }
            at9VarArr2[i] = at9Var;
            i++;
        }
        xt6 xt6Var = this.a;
        long j2 = this.b;
        long c = xt6Var.c(e74VarArr, zArr, at9VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < at9VarArr.length; i2++) {
            at9 at9Var2 = at9VarArr2[i2];
            if (at9Var2 == null) {
                at9VarArr[i2] = null;
            } else {
                at9 at9Var3 = at9VarArr[i2];
                if (at9Var3 == null || ((qrb) at9Var3).a != at9Var2) {
                    at9VarArr[i2] = new qrb(at9Var2, j2);
                }
            }
        }
        return c + j2;
    }

    @Override // xt6
    public final void d() {
        String str = gcc.a;
        this.a.d();
    }

    @Override // i8a
    public final boolean e() {
        return this.a.e();
    }

    @Override // h8a
    public final void f(i8a i8aVar) {
        wt6 wt6Var = this.c;
        wt6Var.getClass();
        wt6Var.f(this);
    }

    @Override // i8a
    public final long h() {
        long h = this.a.h();
        if (h == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return h + this.b;
    }

    @Override // xt6
    public final long j(long j, az9 az9Var) {
        long j2 = this.b;
        return this.a.j(j - j2, az9Var) + j2;
    }

    @Override // xt6
    public final void l() {
        this.a.l();
    }

    @Override // xt6
    public final long m(long j) {
        long j2 = this.b;
        return this.a.m(j - j2) + j2;
    }

    @Override // xt6
    public final void n(long j) {
        this.a.n(j - this.b);
    }

    @Override // xt6
    public final long p() {
        long p = this.a.p();
        if (p == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return p + this.b;
    }

    @Override // xt6
    public final void q(wt6 wt6Var, long j) {
        this.c = wt6Var;
        this.a.q(this, j - this.b);
    }

    @Override // xt6
    public final u1c r() {
        return this.a.r();
    }

    @Override // i8a
    public final boolean s(xa6 xa6Var) {
        wa6 wa6Var = new wa6();
        long j = xa6Var.a;
        wa6Var.b = xa6Var.b;
        wa6Var.c = xa6Var.c;
        wa6Var.a = j - this.b;
        return this.a.s(new xa6(wa6Var));
    }

    @Override // i8a
    public final long t() {
        long t = this.a.t();
        if (t == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return t + this.b;
    }

    @Override // i8a
    public final void u(long j) {
        this.a.u(j - this.b);
    }
}
