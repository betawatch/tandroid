// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
