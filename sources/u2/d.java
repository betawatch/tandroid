package u2;

import i2.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final long c() {
        long c10 = this.a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.f1
    public final boolean d() {
        return this.a.d();
    }

    @Override // u2.d0
    public final void e(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.e(this);
    }

    @Override // u2.e0
    public final void f() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.f();
    }

    @Override // u2.e0
    public final long g(long j10) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long g10 = this.a.g(j10);
        long j11 = this.f;
        long j12 = this.h;
        long max = Math.max(g10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(max, j12) : max;
    }

    @Override // u2.e0
    public final void h(long j10) {
        this.a.h(j10);
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j10) {
        this.b = d0Var;
        this.a.j(this, j10);
    }

    @Override // u2.e0
    public final long k() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long k10 = k();
            return k10 != -9223372036854775807L ? k10 : j10;
        }
        long k11 = this.a.k();
        if (k11 != -9223372036854775807L) {
            long j11 = this.f;
            long j12 = this.h;
            long max = Math.max(k11, j11);
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
        long p5 = this.a.p(qVarArr, zArr, d1VarArr2, zArr2, j10);
        long j12 = this.h;
        long max = Math.max(p5, j10);
        if (j12 != Long.MIN_VALUE) {
            max = Math.min(max, j12);
        }
        if (a()) {
            if (p5 >= j10) {
                if (p5 != 0) {
                    for (x2.q qVar : qVarArr) {
                        if (qVar != null) {
                            b2.x m10 = qVar.m();
                            if (!b2.v0.a(m10.s, m10.k)) {
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
    public final r1 q() {
        return this.a.q();
    }

    @Override // u2.e1
    public final void r(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.r(this);
    }

    @Override // u2.f1
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

    @Override // u2.e0
    public final long t(long j10, v1 v1Var) {
        long j11 = this.f;
        if (j10 == j11) {
            return j11;
        }
        long j12 = e2.l0.j(v1Var.a, 0L, j10 - j11);
        long j13 = v1Var.b;
        long j14 = this.h;
        long j15 = e2.l0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != v1Var.a || j15 != v1Var.b) {
            v1Var = new v1(j12, j15);
        }
        return this.a.t(j10, v1Var);
    }

    @Override // u2.f1
    public final void u(long j10) {
        this.a.u(j10);
    }
}
