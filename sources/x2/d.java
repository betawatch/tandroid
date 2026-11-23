package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    @Override // x2.d0
    public final void V(e0 e0Var) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.V(this);
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
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
        long c10 = this.a.c(uVarArr, zArr, d1VarArr2, zArr2, j3);
        long j11 = this.h;
        long max = Math.max(c10, j3);
        if (j11 != Long.MIN_VALUE) {
            max = Math.min(max, j11);
        }
        if (a()) {
            if (c10 >= j3) {
                if (c10 != 0) {
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
    public final boolean d(l2.t0 t0Var) {
        return this.a.d(t0Var);
    }

    @Override // x2.f1
    public final long f() {
        long f10 = this.a.f();
        if (f10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || f10 < j3) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.a.g();
    }

    @Override // x2.e0
    public final long i(long j3, l2.q1 q1Var) {
        long j10 = this.f;
        if (j3 == j10) {
            return j10;
        }
        long j11 = h2.l0.j(q1Var.a, 0L, j3 - j10);
        long j12 = q1Var.b;
        long j13 = this.h;
        long j14 = h2.l0.j(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j3);
        if (j11 != q1Var.a || j14 != q1Var.b) {
            q1Var = new l2.q1(j11, j14);
        }
        return this.a.i(j3, q1Var);
    }

    @Override // x2.e1
    public final void i2(f1 f1Var) {
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.i2(this);
    }

    @Override // x2.e0
    public final void j() {
        g gVar = this.n;
        if (gVar != null) {
            throw gVar;
        }
        this.a.j();
    }

    @Override // x2.e0
    public final long l(long j3) {
        this.d = -9223372036854775807L;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long l10 = this.a.l(j3);
        long j10 = this.f;
        long j11 = this.h;
        long max = Math.max(l10, j10);
        return j11 != Long.MIN_VALUE ? Math.min(max, j11) : max;
    }

    @Override // x2.e0
    public final void n(long j3) {
        this.a.n(j3);
    }

    @Override // x2.e0
    public final long p() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.e = j3;
            long p10 = p();
            return p10 != -9223372036854775807L ? p10 : j3;
        }
        long p11 = this.a.p();
        if (p11 != -9223372036854775807L) {
            long j10 = this.f;
            long j11 = this.h;
            long max = Math.max(p11, j10);
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
    public final void s(d0 d0Var, long j3) {
        this.b = d0Var;
        this.a.s(this, j3);
    }

    @Override // x2.f1
    public final void u(long j3) {
        this.a.u(j3);
    }
}
