// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zj1 extends bk1 {
    public static final zj1 c = new zj1("CharMatcher.any()", (byte) 0);
    public static final zj1 d = new zj1("CharMatcher.ascii()", (byte) 1);
    public static final zj1 e = new zj1("CharMatcher.javaIsoControl()", (byte) 2);
    public static final zj1 f = new zj1("CharMatcher.none()", (byte) 3);
    public final String a;
    public final /* synthetic */ byte b;

    public zj1(String str, byte b) {
        this.b = b;
        this.a = str;
    }

    @Override // fk1
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

    @Override // bk1, fk1
    public final fk1 c() {
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
