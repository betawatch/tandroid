// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rpb implements jr9 {
    public final jr9 a;
    public final long b;

    public rpb(jr9 jr9Var, long j) {
        this.a = jr9Var;
        this.b = j;
    }

    @Override // jr9
    public final int a() {
        return this.a.a();
    }

    @Override // jr9
    public final void d() {
        this.a.d();
    }

    @Override // jr9
    public final boolean i() {
        return this.a.i();
    }

    @Override // jr9
    public final int m(long j) {
        return this.a.m(j - this.b);
    }

    @Override // jr9
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        int p = this.a.p(mj4Var, la3Var, i);
        if (p == -4) {
            la3Var.e += this.b;
        }
        return p;
    }
}
