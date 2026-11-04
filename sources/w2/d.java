package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements e0, d0 {
    public final e0 a;
    public d0 b;
    public c[] c = new c[0];
    public long d;
    public long e;
    public long f;
    public long h;
    public g n;

    public d(e0 e0Var, boolean z10, long j10, long j11, int i3) {
        this.a = e0Var;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j10;
        this.h = j11;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // w2.d0
    public final void b(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        return this.a.c(v0Var);
    }

    @Override // w2.f1
    public final boolean d() {
        return this.a.d();
    }

    @Override // w2.f1
    public final long e() {
        long e10 = this.a.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // w2.e0
    public final void g() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.g();
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        this.b = d0Var;
        this.a.i(this, j10);
    }

    @Override // w2.e0
    public final long j(long j10) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long j11 = this.a.j(j10);
        long j12 = this.f;
        long j13 = this.h;
        long max = Math.max(j11, j12);
        return j13 != Long.MIN_VALUE ? Math.min(max, j13) : max;
    }

    @Override // w2.e1
    public final void k(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override // w2.e0
    public final void l(long j10) {
        this.a.l(j10);
    }

    @Override // w2.e0
    public final long n() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long n4 = n();
            return n4 != -9223372036854775807L ? n4 : j10;
        }
        long n10 = this.a.n();
        if (n10 != -9223372036854775807L) {
            long j11 = this.f;
            long j12 = this.h;
            long max = Math.max(n10, j11);
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

    @Override // w2.e0
    public final r1 p() {
        return this.a.p();
    }

    @Override // w2.f1
    public final long q() {
        long q10 = this.a.q();
        if (q10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || q10 < j10) {
                return q10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // w2.e0
    public final long r(long j10, k2.t1 t1Var) {
        long j11 = this.f;
        if (j10 == j11) {
            return j11;
        }
        long j12 = g2.n0.j(t1Var.a, 0L, j10 - j11);
        long j13 = t1Var.b;
        long j14 = this.h;
        long j15 = g2.n0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != t1Var.a || j15 != t1Var.b) {
            t1Var = new k2.t1(j12, j15);
        }
        return this.a.r(j10, t1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // w2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        int i3;
        this.c = new c[d1VarArr.length];
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            c[] cVarArr = this.c;
            c cVar = (c) d1VarArr[i10];
            cVarArr[i10] = cVar;
            d1VarArr2[i10] = cVar != null ? cVar.a : null;
        }
        long s6 = this.a.s(pVarArr, zArr, d1VarArr2, zArr2, j10);
        long j12 = this.h;
        long max = Math.max(s6, j10);
        if (j12 != Long.MIN_VALUE) {
            max = Math.min(max, j12);
        }
        if (a()) {
            if (s6 >= j10) {
                if (s6 != 0) {
                    for (z2.p pVar : pVarArr) {
                        if (pVar != null) {
                            d2.v n4 = pVar.n();
                            if (!d2.u0.a(n4.s, n4.k)) {
                            }
                        }
                    }
                }
            }
            j11 = max;
            this.d = j11;
            for (i3 = 0; i3 < d1VarArr.length; i3++) {
                d1 d1Var = d1VarArr2[i3];
                if (d1Var == null) {
                    this.c[i3] = null;
                } else {
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i3];
                    if (cVar2 == null || cVar2.a != d1Var) {
                        cVarArr2[i3] = new c(this, d1Var);
                    }
                }
                d1VarArr[i3] = this.c[i3];
            }
            return max;
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        while (i3 < d1VarArr.length) {
        }
        return max;
    }

    @Override // w2.f1
    public final void t(long j10) {
        this.a.t(j10);
    }
}
