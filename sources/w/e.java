package w;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
