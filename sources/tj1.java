// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tj1 extends sj1 {
    public final /* synthetic */ byte a;
    public final char b;

    public /* synthetic */ tj1(char c, byte b) {
        this.a = b;
        this.b = c;
    }

    @Override // wj1
    public final boolean b(char c) {
        switch (this.a) {
            case 0:
                if (c == this.b) {
                }
                break;
            default:
                if (c != this.b) {
                }
                break;
        }
        return false;
    }

    @Override // sj1, wj1
    public final wj1 c() {
        switch (this.a) {
            case 0:
                return new tj1(this.b, (byte) 1);
            default:
                return new tj1(this.b, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.a;
        char c = this.b;
        switch (b) {
            case 0:
                return "CharMatcher.is('" + wj1.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + wj1.d(c) + "')";
        }
    }
}
