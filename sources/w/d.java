package w;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
