// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yk1 extends al1 {
    public static final yk1 c = new yk1("CharMatcher.any()", (byte) 0);
    public static final yk1 d = new yk1("CharMatcher.ascii()", (byte) 1);
    public static final yk1 e = new yk1("CharMatcher.javaIsoControl()", (byte) 2);
    public static final yk1 f = new yk1("CharMatcher.none()", (byte) 3);
    public final String a;
    public final /* synthetic */ byte b;

    public yk1(String str, byte b) {
        this.b = b;
        this.a = str;
    }

    @Override // el1
    public final boolean b(char c2) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                return c2 <= 127;
            case 2:
                return c2 <= 31 || (c2 >= 127 && c2 <= 159);
            default:
                return false;
        }
    }

    @Override // al1, el1
    public final el1 c() {
        switch (this.b) {
            case 0:
                return f;
            case 3:
                return c;
            default:
                return super.c();
        }
    }

    public final String toString() {
        return this.a;
    }
}
