// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pj1 extends wj1 {
    public final wj1 a;
    public final wj1 b;

    public pj1(wj1 wj1Var, wj1 wj1Var2) {
        this.a = wj1Var;
        wj1Var2.getClass();
        this.b = wj1Var2;
    }

    @Override // wj1
    public final boolean b(char c) {
        return this.a.b(c) && this.b.b(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
