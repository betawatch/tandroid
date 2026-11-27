// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yj1 extends fk1 {
    public final fk1 a;
    public final fk1 b;

    public yj1(fk1 fk1Var, fk1 fk1Var2) {
        this.a = fk1Var;
        fk1Var2.getClass();
        this.b = fk1Var2;
    }

    @Override // fk1
    public final boolean b(char c) {
        return this.a.b(c) && this.b.b(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
