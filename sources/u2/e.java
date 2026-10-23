package u2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class e implements f0, e0 {
    public final f0 a;
    public e0 b;
    public d[] c = new d[0];
    public long d;
    public long e;
    public long f;
    public long h;
    public h n;

    public e(f0 f0Var, boolean z10, long j10, long j11, int i10) {
        this.a = f0Var;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j10;
        this.h = j11;
    }

    @Override // u2.e0
    public final void a(f0 f0Var) {
        if (this.n != null) {
            return;
        }
        e0 e0Var = this.b;
        e0Var.getClass();
        e0Var.a(this);
    }

    @Override // u2.g1
    public final void b(h1 h1Var) {
        e0 e0Var = this.b;
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
        if (d != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean e() {
        return this.d != -9223372036854775807L;
    }

    @Override // u2.f0
    public final void h() {
        h hVar = this.n;
        if (hVar != null) {
            throw hVar;
        }
        this.a.h();
    }

    @Override // u2.f0
    public final long i(long j10) {
        this.d = -9223372036854775807L;
        for (d dVar : this.c) {
            if (dVar != null) {
                dVar.b = false;
            }
        }
        long i10 = this.a.i(j10);
        long j11 = this.f;
        long j12 = this.h;
        long max = Math.max(i10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(max, j12) : max;
    }

    @Override // u2.f0
    public final void l(long j10) {
        this.a.l(j10);
    }

    @Override // u2.f0
    public final void n(e0 e0Var, long j10) {
        this.b = e0Var;
        this.a.n(this, j10);
    }

    @Override // u2.f0
    public final long o() {
        if (e()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long o10 = o();
            return o10 != -9223372036854775807L ? o10 : j10;
        }
        long o11 = this.a.o();
        if (o11 != -9223372036854775807L) {
            long j11 = this.f;
            long j12 = this.h;
            long max = Math.max(o11, j11);
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

    @Override // u2.h1
    public final boolean p(i2.u0 u0Var) {
        return this.a.p(u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        long j11;
        int i10;
        this.c = new d[f1VarArr.length];
        f1[] f1VarArr2 = new f1[f1VarArr.length];
        for (int i11 = 0; i11 < f1VarArr.length; i11++) {
            d[] dVarArr = this.c;
            d dVar = (d) f1VarArr[i11];
            dVarArr[i11] = dVar;
            f1VarArr2[i11] = dVar != null ? dVar.a : null;
        }
        long q6 = this.a.q(pVarArr, zArr, f1VarArr2, zArr2, j10);
        long j12 = this.h;
        long max = Math.max(q6, j10);
        if (j12 != Long.MIN_VALUE) {
            max = Math.min(max, j12);
        }
        if (e()) {
            if (q6 >= j10) {
                if (q6 != 0) {
                    for (x2.p pVar : pVarArr) {
                        if (pVar != null) {
                            b2.w m10 = pVar.m();
                            if (!b2.v0.a(m10.s, m10.k)) {
                            }
                        }
                    }
                }
            }
            j11 = max;
            this.d = j11;
            for (i10 = 0; i10 < f1VarArr.length; i10++) {
                f1 f1Var = f1VarArr2[i10];
                if (f1Var == null) {
                    this.c[i10] = null;
                } else {
                    d[] dVarArr2 = this.c;
                    d dVar2 = dVarArr2[i10];
                    if (dVar2 == null || dVar2.a != f1Var) {
                        dVarArr2[i10] = new d(this, f1Var);
                    }
                }
                f1VarArr[i10] = this.c[i10];
            }
            return max;
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        while (i10 < f1VarArr.length) {
        }
        return max;
    }

    @Override // u2.f0
    public final t1 r() {
        return this.a.r();
    }

    @Override // u2.h1
    public final long s() {
        long s10 = this.a.s();
        if (s10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || s10 < j10) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.f0
    public final long t(long j10, i2.s1 s1Var) {
        long j11 = this.f;
        if (j10 == j11) {
            return j11;
        }
        long j12 = e2.m0.j(s1Var.a, 0L, j10 - j11);
        long j13 = s1Var.b;
        long j14 = this.h;
        long j15 = e2.m0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != s1Var.a || j15 != s1Var.b) {
            s1Var = new i2.s1(j12, j15);
        }
        return this.a.t(j10, s1Var);
    }

    @Override // u2.h1
    public final void u(long j10) {
        this.a.u(j10);
    }
}
