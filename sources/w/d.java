package w;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
