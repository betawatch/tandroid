package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e implements e0, d0 {
    public final e0 a;
    public d0 b;
    public d[] c = new d[0];
    public long d;
    public long e;
    public long f;
    public h h;

    public e(e0 e0Var, boolean z10, long j3, long j10) {
        this.a = e0Var;
        this.d = z10 ? j3 : -9223372036854775807L;
        this.e = j3;
        this.f = j10;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // u2.d0
    public final void b(e0 e0Var) {
        if (this.h != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override // u2.f1
    public final boolean c() {
        return this.a.c();
    }

    @Override // u2.f1
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

    @Override // u2.e0
    public final void f() {
        h hVar = this.h;
        if (hVar != null) {
            throw hVar;
        }
        this.a.f();
    }

    @Override // u2.e1
    public final void g(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override // u2.e0
    public final long h(long j3) {
        this.d = -9223372036854775807L;
        for (d dVar : this.c) {
            if (dVar != null) {
                dVar.b = false;
            }
        }
        long h = this.a.h(j3);
        long j10 = this.e;
        long j11 = this.f;
        long max = Math.max(h, j10);
        return j11 != Long.MIN_VALUE ? Math.min(max, j11) : max;
    }

    @Override // u2.e0
    public final void i(long j3) {
        this.a.i(j3);
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j3) {
        this.b = d0Var;
        this.a.j(this, j3);
    }

    @Override // u2.e0
    public final long m() {
        if (a()) {
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

    @Override // u2.f1
    public final boolean n(i2.q0 q0Var) {
        return this.a.n(q0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        long j10;
        int i10;
        this.c = new d[d1VarArr.length];
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d[] dVarArr = this.c;
            d dVar = (d) d1VarArr[i11];
            dVarArr[i11] = dVar;
            d1VarArr2[i11] = dVar != null ? dVar.a : null;
        }
        long o9 = this.a.o(rVarArr, zArr, d1VarArr2, zArr2, j3);
        long j11 = this.f;
        long max = Math.max(o9, j3);
        if (j11 != Long.MIN_VALUE) {
            max = Math.min(max, j11);
        }
        if (a()) {
            if (o9 >= j3) {
                if (o9 != 0) {
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
            for (i10 = 0; i10 < d1VarArr.length; i10++) {
                d1 d1Var = d1VarArr2[i10];
                if (d1Var == null) {
                    this.c[i10] = null;
                } else {
                    d[] dVarArr2 = this.c;
                    d dVar2 = dVarArr2[i10];
                    if (dVar2 == null || dVar2.a != d1Var) {
                        dVarArr2[i10] = new d(this, d1Var);
                    }
                }
                d1VarArr[i10] = this.c[i10];
            }
            return max;
        }
        j10 = -9223372036854775807L;
        this.d = j10;
        while (i10 < d1VarArr.length) {
        }
        return max;
    }

    @Override // u2.e0
    public final q1 q() {
        return this.a.q();
    }

    @Override // u2.f1
    public final long r() {
        long r10 = this.a.r();
        if (r10 != Long.MIN_VALUE) {
            long j3 = this.f;
            if (j3 == Long.MIN_VALUE || r10 < j3) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.e0
    public final long s(long j3, i2.o1 o1Var) {
        long j10 = this.e;
        if (j3 == j10) {
            return j10;
        }
        long i10 = e2.d0.i(o1Var.a, 0L, j3 - j10);
        long j11 = o1Var.b;
        long j12 = this.f;
        long i11 = e2.d0.i(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j3);
        if (i10 != o1Var.a || i11 != o1Var.b) {
            o1Var = new i2.o1(i10, i11);
        }
        return this.a.s(j3, o1Var);
    }

    @Override // u2.f1
    public final void u(long j3) {
        this.a.u(j3);
    }
}
