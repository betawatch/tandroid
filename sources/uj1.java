// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
