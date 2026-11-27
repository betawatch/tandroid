// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
