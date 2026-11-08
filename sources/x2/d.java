package x2;

import l2.t1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

    public d(e0 e0Var, boolean z9, long j3, long j10, int i7) {
        this.a = e0Var;
        this.d = z9 ? j3 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j3;
        this.h = j10;
    }

    @Override // x2.d0
    public final void a(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10;
        int i7;
        this.c = new c[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        for (int i10 = 0; i10 < c1VarArr.length; i10++) {
            c[] cVarArr = this.c;
            c cVar = (c) c1VarArr[i10];
            cVarArr[i10] = cVar;
            c1VarArr2[i10] = cVar != null ? cVar.a : null;
        }
        long b10 = this.a.b(uVarArr, zArr, c1VarArr2, zArr2, j3);
        long j11 = this.h;
        long max = Math.max(b10, j3);
        if (j11 != Long.MIN_VALUE) {
            max = Math.min(max, j11);
        }
        if (f()) {
            if (b10 >= j3) {
                if (b10 != 0) {
                    for (a3.u uVar : uVarArr) {
                        if (uVar != null) {
                            e2.u n10 = uVar.n();
                            if (!e2.s0.a(n10.s, n10.k)) {
                            }
                        }
                    }
                }
            }
            j10 = max;
            this.d = j10;
            for (i7 = 0; i7 < c1VarArr.length; i7++) {
                c1 c1Var = c1VarArr2[i7];
                if (c1Var == null) {
                    this.c[i7] = null;
                } else {
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i7];
                    if (cVar2 == null || cVar2.a != c1Var) {
                        cVarArr2[i7] = new c(this, c1Var);
                    }
                }
                c1VarArr[i7] = this.c[i7];
            }
            return max;
        }
        j10 = -9223372036854775807L;
        this.d = j10;
        while (i7 < c1VarArr.length) {
        }
        return max;
    }

    @Override // x2.e1
    public final boolean c(l2.v0 v0Var) {
        return this.a.c(v0Var);
    }

    @Override // x2.d1
    public final void d(e1 e1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.d(this);
    }

    @Override // x2.e1
    public final long e() {
        long e10 = this.a.e();
        if (e10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || e10 < j3) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        return this.d != -9223372036854775807L;
    }

    @Override // x2.e1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.e0
    public final long h(long j3, t1 t1Var) {
        long j10 = this.f;
        if (j3 == j10) {
            return j10;
        }
        long j11 = h2.m0.j(t1Var.a, 0L, j3 - j10);
        long j12 = t1Var.b;
        long j13 = this.h;
        long j14 = h2.m0.j(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j3);
        if (j11 != t1Var.a || j14 != t1Var.b) {
            t1Var = new t1(j11, j14);
        }
        return this.a.h(j3, t1Var);
    }

    @Override // x2.e0
    public final void i() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.i();
    }

    @Override // x2.e0
    public final long j(long j3) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long j10 = this.a.j(j3);
        long j11 = this.f;
        long j12 = this.h;
        long max = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(max, j12) : max;
    }

    @Override // x2.e0
    public final void k(long j3) {
        this.a.k(j3);
    }

    @Override // x2.e0
    public final long n() {
        if (f()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.e = j3;
            long n10 = n();
            return n10 != -9223372036854775807L ? n10 : j3;
        }
        long n11 = this.a.n();
        if (n11 != -9223372036854775807L) {
            long j10 = this.f;
            long j11 = this.h;
            long max = Math.max(n11, j10);
            if (j11 != Long.MIN_VALUE) {
                max = Math.min(max, j11);
            }
            if (max != this.e) {
                this.e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // x2.e0
    public final q1 o() {
        return this.a.o();
    }

    @Override // x2.e1
    public final long p() {
        long p10 = this.a.p();
        if (p10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || p10 < j3) {
                return p10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x2.e0
    public final void q(d0 d0Var, long j3) {
        this.b = d0Var;
        this.a.q(this, j3);
    }

    @Override // x2.e1
    public final void r(long j3) {
        this.a.r(j3);
    }
}
