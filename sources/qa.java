// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
