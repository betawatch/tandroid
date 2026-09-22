package w;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e {
    public final Object a;
    public final String b;

    public e(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + h.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
