package u2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class r1 implements f0, e0 {
    public final f0 a;
    public final long b;
    public e0 c;

    public r1(f0 f0Var, long j10) {
        this.a = f0Var;
        this.b = j10;
    }

    @Override // u2.e0
    public final void a(f0 f0Var) {
        e0 e0Var = this.c;
        e0Var.getClass();
        e0Var.a(this);
    }

    @Override // u2.g1
    public final void b(h1 h1Var) {
        e0 e0Var = this.c;
        e0Var.getClass();
        e0Var.b(this);
    }

    @Override // u2.h1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.h1
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // u2.f0
    public final void h() {
        this.a.h();
    }

    @Override // u2.f0
    public final long i(long j10) {
        long j11 = this.b;
        return this.a.i(j10 - j11) + j11;
    }

    @Override // u2.f0
    public final void l(long j10) {
        this.a.l(j10 - this.b);
    }

    @Override // u2.f0
    public final void n(e0 e0Var, long j10) {
        this.c = e0Var;
        this.a.n(this, j10 - this.b);
    }

    @Override // u2.f0
    public final long o() {
        long o10 = this.a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o10 + this.b;
    }

    @Override // u2.h1
    public final boolean p(i2.u0 u0Var) {
        i2.t0 t0Var = new i2.t0();
        long j10 = u0Var.a;
        t0Var.b = u0Var.b;
        t0Var.c = u0Var.c;
        t0Var.a = j10 - this.b;
        return this.a.p(new i2.u0(t0Var));
    }

    @Override // u2.f0
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        f1[] f1VarArr2 = new f1[f1VarArr.length];
        int i10 = 0;
        while (true) {
            f1 f1Var = null;
            if (i10 >= f1VarArr.length) {
                break;
            }
            q1 q1Var = (q1) f1VarArr[i10];
            if (q1Var != null) {
                f1Var = q1Var.a;
            }
            f1VarArr2[i10] = f1Var;
            i10++;
        }
        f0 f0Var = this.a;
        long j11 = this.b;
        long q6 = f0Var.q(pVarArr, zArr, f1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < f1VarArr.length; i11++) {
            f1 f1Var2 = f1VarArr2[i11];
            if (f1Var2 == null) {
                f1VarArr[i11] = null;
            } else {
                f1 f1Var3 = f1VarArr[i11];
                if (f1Var3 == null || ((q1) f1Var3).a != f1Var2) {
                    f1VarArr[i11] = new q1(f1Var2, j11);
                }
            }
        }
        return q6 + j11;
    }

    @Override // u2.f0
    public final t1 r() {
        return this.a.r();
    }

    @Override // u2.h1
    public final long s() {
        long s10 = this.a.s();
        if (s10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s10 + this.b;
    }

    @Override // u2.f0
    public final long t(long j10, i2.s1 s1Var) {
        long j11 = this.b;
        return this.a.t(j10 - j11, s1Var) + j11;
    }

    @Override // u2.h1
    public final void u(long j10) {
        this.a.u(j10 - this.b);
    }
}
