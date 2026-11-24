// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wia {
    public static final wia c = new wia(-1, -1);
    public final int a;
    public final int b;

    static {
        new wia(0, 0);
        String str = g8c.a;
    }

    public wia(int i, int i2) {
        gre.f((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof wia) {
            wia wiaVar = (wia) obj;
            if (this.a == wiaVar.a && this.b == wiaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
