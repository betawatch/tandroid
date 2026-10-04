package w;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
