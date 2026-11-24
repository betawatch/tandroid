// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rnb implements sr6, rr6 {
    public final sr6 a;
    public final long b;
    public rr6 c;

    public rnb(sr6 sr6Var, long j) {
        this.a = sr6Var;
        this.b = j;
    }

    @Override // rr6
    public final void a(sr6 sr6Var) {
        rr6 rr6Var = this.c;
        rr6Var.getClass();
        rr6Var.a(this);
    }

    @Override // p4a
    public final void b(q4a q4aVar) {
        rr6 rr6Var = this.c;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    @Override // q4a
    public final boolean d() {
        return this.a.d();
    }

    @Override // sr6
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        ip9[] ip9VarArr2 = new ip9[ip9VarArr.length];
        int i = 0;
        while (true) {
            ip9 ip9Var = null;
            if (i >= ip9VarArr.length) {
                break;
            }
            qnb qnbVar = (qnb) ip9VarArr[i];
            if (qnbVar != null) {
                ip9Var = qnbVar.a;
            }
            ip9VarArr2[i] = ip9Var;
            i++;
        }
        sr6 sr6Var = this.a;
        long j2 = this.b;
        long e = sr6Var.e(k64VarArr, zArr, ip9VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ip9VarArr.length; i2++) {
            ip9 ip9Var2 = ip9VarArr2[i2];
            if (ip9Var2 == null) {
                ip9VarArr[i2] = null;
            } else {
                ip9 ip9Var3 = ip9VarArr[i2];
                if (ip9Var3 == null || ((qnb) ip9Var3).a != ip9Var2) {
                    ip9VarArr[i2] = new qnb(ip9Var2, j2);
                }
            }
        }
        return e + j2;
    }

    @Override // sr6
    public final void f() {
        String str = g8c.a;
        this.a.f();
    }

    @Override // q4a
    public final long g() {
        long g = this.a.g();
        if (g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g + this.b;
    }

    @Override // sr6
    public final long i(long j, gv9 gv9Var) {
        long j2 = this.b;
        return this.a.i(j - j2, gv9Var) + j2;
    }

    @Override // sr6
    public final void k() {
        this.a.k();
    }

    @Override // sr6
    public final long l(long j) {
        long j2 = this.b;
        return this.a.l(j - j2) + j2;
    }

    @Override // sr6
    public final void m(long j) {
        this.a.m(j - this.b);
    }

    @Override // sr6
    public final long o() {
        long o = this.a.o();
        if (o == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o + this.b;
    }

    @Override // sr6
    public final void p(rr6 rr6Var, long j) {
        this.c = rr6Var;
        this.a.p(this, j - this.b);
    }

    @Override // sr6
    public final txb q() {
        return this.a.q();
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        s86 s86Var = new s86();
        long j = t86Var.a;
        s86Var.b = t86Var.b;
        s86Var.c = t86Var.c;
        s86Var.a = j - this.b;
        return this.a.r(new t86(s86Var));
    }

    @Override // q4a
    public final long s() {
        long s = this.a.s();
        if (s == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s + this.b;
    }

    @Override // q4a
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
