// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class spb implements tt6, st6 {
    public final tt6 a;
    public final long b;
    public st6 c;

    public spb(tt6 tt6Var, long j) {
        this.a = tt6Var;
        this.b = j;
    }

    @Override // st6
    public final void a(tt6 tt6Var) {
        st6 st6Var = this.c;
        st6Var.getClass();
        st6Var.a(this);
    }

    @Override // r6a
    public final void b(s6a s6aVar) {
        st6 st6Var = this.c;
        st6Var.getClass();
        st6Var.b(this);
    }

    @Override // tt6
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        jr9[] jr9VarArr2 = new jr9[jr9VarArr.length];
        int i = 0;
        while (true) {
            jr9 jr9Var = null;
            if (i >= jr9VarArr.length) {
                break;
            }
            rpb rpbVar = (rpb) jr9VarArr[i];
            if (rpbVar != null) {
                jr9Var = rpbVar.a;
            }
            jr9VarArr2[i] = jr9Var;
            i++;
        }
        tt6 tt6Var = this.a;
        long j2 = this.b;
        long c = tt6Var.c(t74VarArr, zArr, jr9VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < jr9VarArr.length; i2++) {
            jr9 jr9Var2 = jr9VarArr2[i2];
            if (jr9Var2 == null) {
                jr9VarArr[i2] = null;
            } else {
                jr9 jr9Var3 = jr9VarArr[i2];
                if (jr9Var3 == null || ((rpb) jr9Var3).a != jr9Var2) {
                    jr9VarArr[i2] = new rpb(jr9Var2, j2);
                }
            }
        }
        return c + j2;
    }

    @Override // tt6
    public final void e() {
        String str = hac.a;
        this.a.e();
    }

    @Override // s6a
    public final boolean f() {
        return this.a.f();
    }

    @Override // s6a
    public final long g() {
        long g = this.a.g();
        if (g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g + this.b;
    }

    @Override // tt6
    public final long h(long j, jx9 jx9Var) {
        long j2 = this.b;
        return this.a.h(j - j2, jx9Var) + j2;
    }

    @Override // tt6
    public final void j() {
        this.a.j();
    }

    @Override // tt6
    public final long k(long j) {
        long j2 = this.b;
        return this.a.k(j - j2) + j2;
    }

    @Override // tt6
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override // tt6
    public final long n() {
        long n = this.a.n();
        if (n == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n + this.b;
    }

    @Override // tt6
    public final void o(st6 st6Var, long j) {
        this.c = st6Var;
        this.a.o(this, j - this.b);
    }

    @Override // tt6
    public final vzb q() {
        return this.a.q();
    }

    @Override // s6a
    public final boolean r(sa6 sa6Var) {
        ra6 ra6Var = new ra6();
        long j = sa6Var.a;
        ra6Var.b = sa6Var.b;
        ra6Var.c = sa6Var.c;
        ra6Var.a = j - this.b;
        return this.a.r(new sa6(ra6Var));
    }

    @Override // s6a
    public final long s() {
        long s = this.a.s();
        if (s == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s + this.b;
    }

    @Override // s6a
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
