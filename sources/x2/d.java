package x2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    public d(e0 e0Var, boolean z10, long j3, long j10, int i7) {
        this.a = e0Var;
        this.d = z10 ? j3 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j3;
        this.h = j10;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10;
        int i7;
        this.c = new c[d1VarArr.length];
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            c[] cVarArr = this.c;
            c cVar = (c) d1VarArr[i10];
            cVarArr[i10] = cVar;
            d1VarArr2[i10] = cVar != null ? cVar.a : null;
        }
        long b10 = this.a.b(uVarArr, zArr, d1VarArr2, zArr2, j3);
        long j11 = this.h;
        long max = Math.max(b10, j3);
        if (j11 != Long.MIN_VALUE) {
            max = Math.min(max, j11);
        }
        if (a()) {
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
            for (i7 = 0; i7 < d1VarArr.length; i7++) {
                d1 d1Var = d1VarArr2[i7];
                if (d1Var == null) {
                    this.c[i7] = null;
                } else {
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i7];
                    if (cVar2 == null || cVar2.a != d1Var) {
                        cVarArr2[i7] = new c(this, d1Var);
                    }
                }
                d1VarArr[i7] = this.c[i7];
            }
            return max;
        }
        j10 = -9223372036854775807L;
        this.d = j10;
        while (i7 < d1VarArr.length) {
        }
        return max;
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        return this.a.c(s0Var);
    }

    @Override // x2.e1
    public final void c0(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.c0(this);
    }

    @Override // x2.f1
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

    @Override // x2.e0
    public final long f(long j3, l2.p1 p1Var) {
        long j10 = this.f;
        if (j3 == j10) {
            return j10;
        }
        long j11 = h2.l0.j(p1Var.a, 0L, j3 - j10);
        long j12 = p1Var.b;
        long j13 = this.h;
        long j14 = h2.l0.j(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j3);
        if (j11 != p1Var.a || j14 != p1Var.b) {
            p1Var = new l2.p1(j11, j14);
        }
        return this.a.f(j3, p1Var);
    }

    @Override // x2.f1
    public final boolean g() {
        return this.a.g();
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
    public final long k(long j3) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long k10 = this.a.k(j3);
        long j10 = this.f;
        long j11 = this.h;
        long max = Math.max(k10, j10);
        return j11 != Long.MIN_VALUE ? Math.min(max, j11) : max;
    }

    @Override // x2.d0
    public final void m(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.m(this);
    }

    @Override // x2.e0
    public final void n(long j3) {
        this.a.n(j3);
    }

    @Override // x2.e0
    public final long o() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.e = j3;
            long o4 = o();
            return o4 != -9223372036854775807L ? o4 : j3;
        }
        long o10 = this.a.o();
        if (o10 != -9223372036854775807L) {
            long j10 = this.f;
            long j11 = this.h;
            long max = Math.max(o10, j10);
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
    public final r1 q() {
        return this.a.q();
    }

    @Override // x2.f1
    public final long r() {
        long r10 = this.a.r();
        if (r10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || r10 < j3) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        this.b = d0Var;
        this.a.t(this, j3);
    }

    @Override // x2.f1
    public final void u(long j3) {
        this.a.u(j3);
    }
}
