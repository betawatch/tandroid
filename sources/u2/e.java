package u2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e implements e0, d0 {
    public final e0 a;
    public d0 b;
    public d[] c = new d[0];
    public long d;
    public long e;
    public long f;
    public long h;
    public h n;

    public e(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        this.a = e0Var;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j10;
        this.h = j11;
    }

    @Override // u2.e1
    public final void F(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.F(this);
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.f1
    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.e0
    public final void g() {
        h hVar = this.n;
        if (hVar != null) {
            throw hVar;
        }
        this.a.g();
    }

    @Override // u2.e0
    public final long h(long j10) {
        this.d = -9223372036854775807L;
        for (d dVar : this.c) {
            if (dVar != null) {
                dVar.b = false;
            }
        }
        long h = this.a.h(j10);
        long j11 = this.f;
        long j12 = this.h;
        long max = Math.max(h, j11);
        return j12 != Long.MIN_VALUE ? Math.min(max, j12) : max;
    }

    @Override // u2.e0
    public final void i(long j10) {
        this.a.i(j10);
    }

    @Override // u2.e0
    public final void k(d0 d0Var, long j10) {
        this.b = d0Var;
        this.a.k(this, j10);
    }

    @Override // u2.e0
    public final long l() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long l4 = l();
            return l4 != -9223372036854775807L ? l4 : j10;
        }
        long l10 = this.a.l();
        if (l10 != -9223372036854775807L) {
            long j11 = this.f;
            long j12 = this.h;
            long max = Math.max(l10, j11);
            if (j12 != Long.MIN_VALUE) {
                max = Math.min(max, j12);
            }
            if (max != this.e) {
                this.e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean m(i2.v0 v0Var) {
        return this.a.m(v0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        int i10;
        this.c = new d[d1VarArr.length];
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d[] dVarArr = this.c;
            d dVar = (d) d1VarArr[i11];
            dVarArr[i11] = dVar;
            d1VarArr2[i11] = dVar != null ? dVar.a : null;
        }
        long n10 = this.a.n(pVarArr, zArr, d1VarArr2, zArr2, j10);
        long j12 = this.h;
        long max = Math.max(n10, j10);
        if (j12 != Long.MIN_VALUE) {
            max = Math.min(max, j12);
        }
        if (a()) {
            if (n10 >= j10) {
                if (n10 != 0) {
                    for (x2.p pVar : pVarArr) {
                        if (pVar != null) {
                            b2.x m10 = pVar.m();
                            if (!b2.w0.a(m10.s, m10.k)) {
                            }
                        }
                    }
                }
            }
            j11 = max;
            this.d = j11;
            for (i10 = 0; i10 < d1VarArr.length; i10++) {
                d1 d1Var = d1VarArr2[i10];
                if (d1Var == null) {
                    this.c[i10] = null;
                } else {
                    d[] dVarArr2 = this.c;
                    d dVar2 = dVarArr2[i10];
                    if (dVar2 == null || dVar2.a != d1Var) {
                        dVarArr2[i10] = new d(this, d1Var);
                    }
                }
                d1VarArr[i10] = this.c[i10];
            }
            return max;
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        while (i10 < d1VarArr.length) {
        }
        return max;
    }

    @Override // u2.e0
    public final r1 o() {
        return this.a.o();
    }

    @Override // u2.f1
    public final long p() {
        long p5 = this.a.p();
        if (p5 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || p5 < j10) {
                return p5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.d0
    public final void q(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.q(this);
    }

    @Override // u2.e0
    public final long r(long j10, i2.t1 t1Var) {
        long j11 = this.f;
        if (j10 == j11) {
            return j11;
        }
        long j12 = e2.m0.j(t1Var.a, 0L, j10 - j11);
        long j13 = t1Var.b;
        long j14 = this.h;
        long j15 = e2.m0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != t1Var.a || j15 != t1Var.b) {
            t1Var = new i2.t1(j12, j15);
        }
        return this.a.r(j10, t1Var);
    }

    @Override // u2.f1
    public final void s(long j10) {
        this.a.s(j10);
    }
}
