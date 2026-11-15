package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    public d(d0 d0Var, boolean z10, long j3, long j10, int i7) {
        this.a = d0Var;
        this.d = z10 ? j3 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j3;
        this.h = j10;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // x2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        long j10;
        int i7;
        this.c = new c[b1VarArr.length];
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            c[] cVarArr = this.c;
            c cVar = (c) b1VarArr[i10];
            cVarArr[i10] = cVar;
            b1VarArr2[i10] = cVar != null ? cVar.a : null;
        }
        long b10 = this.a.b(uVarArr, zArr, b1VarArr2, zArr2, j3);
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
            for (i7 = 0; i7 < b1VarArr.length; i7++) {
                b1 b1Var = b1VarArr2[i7];
                if (b1Var == null) {
                    this.c[i7] = null;
                } else {
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i7];
                    if (cVar2 == null || cVar2.a != b1Var) {
                        cVarArr2[i7] = new c(this, b1Var);
                    }
                }
                b1VarArr[i7] = this.c[i7];
            }
            return max;
        }
        j10 = -9223372036854775807L;
        this.d = j10;
        while (i7 < b1VarArr.length) {
        }
        return max;
    }

    @Override // x2.d1
    public final boolean c(l2.s0 s0Var) {
        return this.a.c(s0Var);
    }

    @Override // x2.d1
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

    @Override // x2.c1
    public final void f0(d1 d1Var) {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.f0(this);
    }

    @Override // x2.d1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.d0
    public final long h(long j3, l2.p1 p1Var) {
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
        return this.a.h(j3, p1Var);
    }

    @Override // x2.d0
    public final void i() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.i();
    }

    @Override // x2.d0
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

    @Override // x2.c0
    public final void k(d0 d0Var) {
        if (this.n != null) {
            return;
        }
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.k(this);
    }

    @Override // x2.d0
    public final void l(long j3) {
        this.a.l(j3);
    }

    @Override // x2.d0
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

    @Override // x2.d0
    public final q1 p() {
        return this.a.p();
    }

    @Override // x2.d1
    public final long s() {
        long s5 = this.a.s();
        if (s5 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || s5 < j3) {
                return s5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x2.d0
    public final void t(c0 c0Var, long j3) {
        this.b = c0Var;
        this.a.t(this, j3);
    }

    @Override // x2.d1
    public final void u(long j3) {
        this.a.u(j3);
    }
}
