// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xk1 extends el1 {
    public final el1 a;
    public final el1 b;

    public xk1(el1 el1Var, el1 el1Var2) {
        this.a = el1Var;
        el1Var2.getClass();
        this.b = el1Var2;
    }

    @Override // el1
    public final boolean b(char c) {
        return this.a.b(c) && this.b.b(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
