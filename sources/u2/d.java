package u2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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

    @Override // u2.e1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.e1
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

    @Override // u2.d1
    public final void l(e1 e1Var) {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.l(this);
    }

    @Override // u2.d0
    public final long m() {
        if (b()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long m10 = m();
            return m10 != -9223372036854775807L ? m10 : j3;
        }
        long m11 = this.a.m();
        if (m11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f;
        long max = Math.max(m11, j10);
        return j11 != Long.MIN_VALUE ? Math.min(max, j11) : max;
    }

    @Override // u2.e1
    public final boolean q(i2.r0 r0Var) {
        return this.a.q(r0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10;
        int i10;
        this.c = new c[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c[] cVarArr = this.c;
            c cVar = (c) c1VarArr[i11];
            cVarArr[i11] = cVar;
            c1VarArr2[i11] = cVar != null ? cVar.a : null;
        }
        long r10 = this.a.r(sVarArr, zArr, c1VarArr2, zArr2, j3);
        long j11 = this.f;
        long max = Math.max(r10, j3);
        if (j11 != Long.MIN_VALUE) {
            max = Math.min(max, j11);
        }
        if (b()) {
            if (r10 >= j3) {
                if (r10 != 0) {
                    for (x2.s sVar : sVarArr) {
                        if (sVar != null) {
                            b2.s m10 = sVar.m();
                            if (!b2.r0.a(m10.r, m10.k)) {
                            }
                        }
                    }
                }
            }
            j10 = max;
            this.d = j10;
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
        j10 = -9223372036854775807L;
        this.d = j10;
        while (i10 < c1VarArr.length) {
        }
        return max;
    }

    @Override // u2.d0
    public final p1 s() {
        return this.a.s();
    }

    @Override // u2.e1
    public final long t() {
        long t10 = this.a.t();
        if (t10 != Long.MIN_VALUE) {
            long j3 = this.f;
            if (j3 == Long.MIN_VALUE || t10 < j3) {
                return t10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.d0
    public final long u(long j3, i2.p1 p1Var) {
        long j10 = this.e;
        if (j3 == j10) {
            return j10;
        }
        long i10 = e2.d0.i(p1Var.a, 0L, j3 - j10);
        long j11 = p1Var.b;
        long j12 = this.f;
        long i11 = e2.d0.i(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j3);
        if (i10 != p1Var.a || i11 != p1Var.b) {
            p1Var = new i2.p1(i10, i11);
        }
        return this.a.u(j3, p1Var);
    }

    @Override // u2.e1
    public final void v(long j3) {
        this.a.v(j3);
    }
}
