package w;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class d {
    public final Object a;
    public final String b;

    public d(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + g.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
