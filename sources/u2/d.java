package u2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public d(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        this.a = e0Var;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j10;
        this.h = j11;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // u2.f1
    public final long b() {
        long b10 = this.a.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.e0
    public final void g() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.g();
    }

    @Override // u2.e0
    public final long h(long j10) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
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
    public final boolean m(i2.w0 w0Var) {
        return this.a.m(w0Var);
    }

    @Override // u2.d0
    public final void n(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        int i10;
        this.c = new c[d1VarArr.length];
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            c[] cVarArr = this.c;
            c cVar = (c) d1VarArr[i11];
            cVarArr[i11] = cVar;
            d1VarArr2[i11] = cVar != null ? cVar.a : null;
        }
        long o10 = this.a.o(qVarArr, zArr, d1VarArr2, zArr2, j10);
        long j12 = this.h;
        long max = Math.max(o10, j10);
        if (j12 != Long.MIN_VALUE) {
            max = Math.min(max, j12);
        }
        if (a()) {
            if (o10 >= j10) {
                if (o10 != 0) {
                    for (x2.q qVar : qVarArr) {
                        if (qVar != null) {
                            b2.x m10 = qVar.m();
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
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i10];
                    if (cVar2 == null || cVar2.a != d1Var) {
                        cVarArr2[i10] = new c(this, d1Var);
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
    public final r1 p() {
        return this.a.p();
    }

    @Override // u2.f1
    public final long q() {
        long q5 = this.a.q();
        if (q5 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || q5 < j10) {
                return q5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.e0
    public final long r(long j10, i2.t1 t1Var) {
        long j11 = this.f;
        if (j10 == j11) {
            return j11;
        }
        long j12 = e2.n0.j(t1Var.a, 0L, j10 - j11);
        long j13 = t1Var.b;
        long j14 = this.h;
        long j15 = e2.n0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != t1Var.a || j15 != t1Var.b) {
            t1Var = new i2.t1(j12, j15);
        }
        return this.a.r(j10, t1Var);
    }

    @Override // u2.f1
    public final void s(long j10) {
        this.a.s(j10);
    }

    @Override // u2.e1
    public final void u(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.u(this);
    }
}
