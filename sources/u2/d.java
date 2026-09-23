package u2;

import i2.q1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class d implements d0, c0 {
    public final d0 a;
    public c0 b;
    public c[] c = new c[0];
    public long d;
    public long e;
    public long f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        this.a = d0Var;
        this.d = z10 ? j3 : -9223372036854775807L;
        this.e = j3;
        this.f = j10;
    }

    @Override // u2.c0
    public final void a(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.a(this);
    }

    public final boolean b() {
        return this.d != -9223372036854775807L;
    }

    @Override // u2.c1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.c1
    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f;
            if (j3 == Long.MIN_VALUE || d < j3) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.d0
    public final void g() {
        g gVar = this.h;
        if (gVar != null) {
            throw gVar;
        }
        this.a.g();
    }

    @Override // u2.d0
    public final long h(long j3) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long h = this.a.h(j3);
        long j10 = this.e;
        long j11 = this.f;
        long max = Math.max(h, j10);
        return j11 != Long.MIN_VALUE ? Math.min(max, j11) : max;
    }

    @Override // u2.d0
    public final void i(long j3) {
        this.a.i(j3);
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        this.b = c0Var;
        this.a.k(this, j3);
    }

    @Override // u2.d0
    public final long l() {
        if (b()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long l4 = l();
            return l4 != -9223372036854775807L ? l4 : j3;
        }
        long l10 = this.a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f;
        long max = Math.max(l10, j10);
        return j11 != Long.MIN_VALUE ? Math.min(max, j11) : max;
    }

    @Override // u2.c1
    public final boolean m(i2.s0 s0Var) {
        return this.a.m(s0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        long j10;
        int i10;
        this.c = new c[a1VarArr.length];
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            c[] cVarArr = this.c;
            c cVar = (c) a1VarArr[i11];
            cVarArr[i11] = cVar;
            a1VarArr2[i11] = cVar != null ? cVar.a : null;
        }
        long p5 = this.a.p(rVarArr, zArr, a1VarArr2, zArr2, j3);
        long j11 = this.f;
        long max = Math.max(p5, j3);
        if (j11 != Long.MIN_VALUE) {
            max = Math.min(max, j11);
        }
        if (b()) {
            if (p5 >= j3) {
                if (p5 != 0) {
                    for (x2.r rVar : rVarArr) {
                        if (rVar != null) {
                            b2.s m10 = rVar.m();
                            if (!b2.r0.a(m10.r, m10.k)) {
                            }
                        }
                    }
                }
            }
            j10 = max;
            this.d = j10;
            for (i10 = 0; i10 < a1VarArr.length; i10++) {
                a1 a1Var = a1VarArr2[i10];
                if (a1Var == null) {
                    this.c[i10] = null;
                } else {
                    c[] cVarArr2 = this.c;
                    c cVar2 = cVarArr2[i10];
                    if (cVar2 == null || cVar2.a != a1Var) {
                        cVarArr2[i10] = new c(this, a1Var);
                    }
                }
                a1VarArr[i10] = this.c[i10];
            }
            return max;
        }
        j10 = -9223372036854775807L;
        this.d = j10;
        while (i10 < a1VarArr.length) {
        }
        return max;
    }

    @Override // u2.d0
    public final n1 r() {
        return this.a.r();
    }

    @Override // u2.c1
    public final long s() {
        long s10 = this.a.s();
        if (s10 != Long.MIN_VALUE) {
            long j3 = this.f;
            if (j3 == Long.MIN_VALUE || s10 < j3) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.d0
    public final long t(long j3, q1 q1Var) {
        long j10 = this.e;
        if (j3 == j10) {
            return j10;
        }
        long i10 = e2.d0.i(q1Var.a, 0L, j3 - j10);
        long j11 = q1Var.b;
        long j12 = this.f;
        long i11 = e2.d0.i(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j3);
        if (i10 != q1Var.a || i11 != q1Var.b) {
            q1Var = new q1(i10, i11);
        }
        return this.a.t(j3, q1Var);
    }

    @Override // u2.c1
    public final void u(long j3) {
        this.a.u(j3);
    }

    @Override // u2.b1
    public final void v(c1 c1Var) {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.v(this);
    }
}
