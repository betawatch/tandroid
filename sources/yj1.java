// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
