// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uj1 extends sj1 {
    public final char a;
    public final char b;

    public uj1(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // wj1
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + wj1.d(this.a) + wj1.d(this.b) + "\")";
    }
}
