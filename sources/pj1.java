// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pj1 {
    public static final oj1 b = new oj1();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof pj1) {
            return this.a.equals(((pj1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof nj1) {
            return ((nj1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
