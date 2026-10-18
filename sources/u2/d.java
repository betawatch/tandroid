package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d implements d0, c0 {
    public final d0 a;
    public c0 b;
    public c[] c = new c[0];
    public long d;
    public long e;
    public long f;
    public long h;
    public g n;

    public d(d0 d0Var, boolean z10, long j10, long j11, int i10) {
        this.a = d0Var;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j10;
        this.h = j11;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // u2.e1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.e1
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

    @Override // u2.d0
    public final void g() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.g();
    }

    @Override // u2.c0
    public final void h(d0 d0Var) {
        if (this.n != null) {
            return;
        }
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override // u2.d0
    public final long i(long j10) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long i10 = this.a.i(j10);
        long j11 = this.f;
        long j12 = this.h;
        long max = Math.max(i10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(max, j12) : max;
    }

    @Override // u2.d0
    public final void k(long j10) {
        this.a.k(j10);
    }

    @Override // u2.d0
    public final void m(c0 c0Var, long j10) {
        this.b = c0Var;
        this.a.m(this, j10);
    }

    @Override // u2.d0
    public final long o() {
        if (a()) {
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

    @Override // u2.e1
    public final boolean p(i2.u0 u0Var) {
        return this.a.p(u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11;
        int i10;
        this.c = new c[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c[] cVarArr = this.c;
            c cVar = (c) c1VarArr[i11];
            cVarArr[i11] = cVar;
            c1VarArr2[i11] = cVar != null ? cVar.a : null;
        }
        long q6 = this.a.q(pVarArr, zArr, c1VarArr2, zArr2, j10);
        long j12 = this.h;
        long max = Math.max(q6, j10);
        if (j12 != Long.MIN_VALUE) {
            max = Math.min(max, j12);
        }
        if (a()) {
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
            for (i10 = 0; i10 < c1VarArr.length; i10++) {
                c1 c1Var = c1VarArr2[i10];
                if (c1Var == null) {
                    this.c[i10] = null;
                } else {
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i10];
                    if (cVar2 == null || cVar2.a != c1Var) {
                        cVarArr2[i10] = new c(this, c1Var);
                    }
                }
                c1VarArr[i10] = this.c[i10];
            }
            return max;
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        while (i10 < c1VarArr.length) {
        }
        return max;
    }

    @Override // u2.d0
    public final q1 r() {
        return this.a.r();
    }

    @Override // u2.e1
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

    @Override // u2.d0
    public final long t(long j10, i2.r1 r1Var) {
        long j11 = this.f;
        if (j10 == j11) {
            return j11;
        }
        long j12 = e2.m0.j(r1Var.a, 0L, j10 - j11);
        long j13 = r1Var.b;
        long j14 = this.h;
        long j15 = e2.m0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != r1Var.a || j15 != r1Var.b) {
            r1Var = new i2.r1(j12, j15);
        }
        return this.a.t(j10, r1Var);
    }

    @Override // u2.e1
    public final void u(long j10) {
        this.a.u(j10);
    }

    @Override // u2.d1
    public final void v(e1 e1Var) {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.v(this);
    }
}
