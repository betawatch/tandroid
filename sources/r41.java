// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r41 {
    public final Object a;
    public final String b;

    public r41(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + u41.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
