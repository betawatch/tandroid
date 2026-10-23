package u2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class q1 implements e0, d0 {
    public final e0 a;
    public final long b;
    public d0 c;

    public q1(e0 e0Var, long j10) {
        this.a = e0Var;
        this.b = j10;
    }

    @Override // u2.d0
    public final void a(e0 e0Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override // u2.g1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.g1
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // u2.f1
    public final void h(g1 g1Var) {
        d0 d0Var = this.c;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override // u2.e0
    public final void i() {
        this.a.i();
    }

    @Override // u2.e0
    public final long j(long j10) {
        long j11 = this.b;
        return this.a.j(j10 - j11) + j11;
    }

    @Override // u2.e0
    public final void l(long j10) {
        this.a.l(j10 - this.b);
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

    @Override // u2.g1
    public final boolean p(i2.v0 v0Var) {
        i2.u0 u0Var = new i2.u0();
        long j10 = v0Var.a;
        u0Var.b = v0Var.b;
        u0Var.c = v0Var.c;
        u0Var.a = j10 - this.b;
        return this.a.p(new i2.v0(u0Var));
    }

    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        e1[] e1VarArr2 = new e1[e1VarArr.length];
        int i10 = 0;
        while (true) {
            e1 e1Var = null;
            if (i10 >= e1VarArr.length) {
                break;
            }
            p1 p1Var = (p1) e1VarArr[i10];
            if (p1Var != null) {
                e1Var = p1Var.a;
            }
            e1VarArr2[i10] = e1Var;
            i10++;
        }
        e0 e0Var = this.a;
        long j11 = this.b;
        long q6 = e0Var.q(pVarArr, zArr, e1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < e1VarArr.length; i11++) {
            e1 e1Var2 = e1VarArr2[i11];
            if (e1Var2 == null) {
                e1VarArr[i11] = null;
            } else {
                e1 e1Var3 = e1VarArr[i11];
                if (e1Var3 == null || ((p1) e1Var3).a != e1Var2) {
                    e1VarArr[i11] = new p1(e1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override // u2.e0
    public final s1 r() {
        return this.a.r();
    }

    @Override // u2.g1
    public final long s() {
        long s10 = this.a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.b;
    }

    @Override // u2.e0
    public final long t(long j10, i2.s1 s1Var) {
        long j11 = this.b;
        return this.a.t(j10 - j11, s1Var) + j11;
    }

    @Override // u2.g1
    public final void u(long j10) {
        this.a.u(j10 - this.b);
    }
}
