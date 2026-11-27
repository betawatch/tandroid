// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
