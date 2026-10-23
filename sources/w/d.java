package w;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
