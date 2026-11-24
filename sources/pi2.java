// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pi2 implements sr6, rr6 {
    public final sr6 a;
    public rr6 b;
    public oi2[] c = new oi2[0];
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public long n;
    public long r;
    public ri2 s;

    public pi2(sr6 sr6Var, boolean z, long j, long j2, int i) {
        this.a = sr6Var;
        this.d = z ? j : -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.n = j;
        this.r = j2;
    }

    @Override // rr6
    public final void a(sr6 sr6Var) {
        if (this.s != null) {
            return;
        }
        rr6 rr6Var = this.b;
        rr6Var.getClass();
        rr6Var.a(this);
    }

    @Override // p4a
    public final void b(q4a q4aVar) {
        rr6 rr6Var = this.b;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    public final boolean c() {
        return (this.d == -9223372036854775807L || this.e) ? false : true;
    }

    @Override // q4a
    public final boolean d() {
        return this.a.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r4 == false) goto L34;
     */
    @Override // sr6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        boolean z;
        k64 k64Var;
        this.c = new oi2[ip9VarArr.length];
        ip9[] ip9VarArr2 = new ip9[ip9VarArr.length];
        int i = 0;
        while (true) {
            ip9 ip9Var = null;
            if (i >= ip9VarArr.length) {
                break;
            }
            oi2[] oi2VarArr = this.c;
            oi2 oi2Var = (oi2) ip9VarArr[i];
            oi2VarArr[i] = oi2Var;
            if (oi2Var != null) {
                ip9Var = oi2Var.a;
            }
            ip9VarArr2[i] = ip9Var;
            i++;
        }
        long e = this.a.e(k64VarArr, zArr, ip9VarArr2, zArr2, j);
        long j2 = this.r;
        long max = Math.max(e, j);
        if (j2 != Long.MIN_VALUE) {
            max = Math.min(max, j2);
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i2 >= ip9VarArr.length) {
                break;
            }
            ip9 ip9Var2 = ip9VarArr2[i2];
            oi2[] oi2VarArr2 = this.c;
            if (ip9Var2 == null) {
                oi2VarArr2[i2] = null;
            } else {
                oi2 oi2Var2 = oi2VarArr2[i2];
                if (oi2Var2 == null || oi2Var2.a != ip9Var2) {
                    if (c()) {
                        if (e < j) {
                            z = true;
                        } else if (e == 0 || (k64Var = k64VarArr[i2]) == null) {
                            z = false;
                        } else {
                            fm4 o = k64Var.o();
                            z = !ud7.a(o.t, o.l);
                        }
                    }
                    z3 = false;
                    oi2[] oi2VarArr3 = this.c;
                    ip9 ip9Var3 = ip9VarArr2[i2];
                    ip9Var3.getClass();
                    oi2VarArr3[i2] = new oi2(this, ip9Var3, z3);
                    z2 |= z3;
                }
            }
            ip9VarArr[i2] = this.c[i2];
            i2++;
        }
        this.d = z2 ? max : -9223372036854775807L;
        if (this.f) {
            this.e = true;
        }
        return max;
    }

    @Override // sr6
    public final void f() {
        this.f = true;
        this.a.f();
    }

    @Override // q4a
    public final long g() {
        long g = this.a.g();
        if (g != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // sr6
    public final long i(long j, gv9 gv9Var) {
        long j2 = this.n;
        if (j == j2) {
            return j2;
        }
        long j3 = g8c.j(gv9Var.a, 0L, j - j2);
        long j4 = gv9Var.b;
        long j5 = this.r;
        long j6 = g8c.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != gv9Var.a || j6 != gv9Var.b) {
            gv9Var = new gv9(j3, j6);
        }
        return this.a.i(j, gv9Var);
    }

    @Override // sr6
    public final void k() {
        ri2 ri2Var = this.s;
        if (ri2Var != null) {
            throw ri2Var;
        }
        this.a.k();
    }

    @Override // sr6
    public final long l(long j) {
        this.d = -9223372036854775807L;
        for (oi2 oi2Var : this.c) {
            if (oi2Var != null) {
                oi2Var.c = false;
            }
        }
        long l = this.a.l(j);
        long j2 = this.n;
        long j3 = this.r;
        long max = Math.max(l, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // sr6
    public final void m(long j) {
        this.a.m(j);
    }

    @Override // sr6
    public final long o() {
        if (c()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.h = j;
            long o = o();
            return o != -9223372036854775807L ? o : j;
        }
        long o2 = this.a.o();
        if (o2 != -9223372036854775807L) {
            long j2 = this.n;
            long j3 = this.r;
            long max = Math.max(o2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.h) {
                this.h = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // sr6
    public final void p(rr6 rr6Var, long j) {
        this.b = rr6Var;
        this.a.p(this, j);
    }

    @Override // sr6
    public final txb q() {
        return this.a.q();
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        return this.a.r(t86Var);
    }

    @Override // q4a
    public final long s() {
        long s = this.a.s();
        if (s != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || s < j) {
                return s;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q4a
    public final void t(long j) {
        this.a.t(j);
    }
}
