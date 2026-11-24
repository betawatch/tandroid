// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qa {
    public final String a;
    public final int b;
    public transient String c;

    public qa(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String format = String.format("%s:%d", this.a, Integer.valueOf(this.b));
        this.c = format;
        return format;
    }
}
