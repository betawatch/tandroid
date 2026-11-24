// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rv5 implements Comparable {
    public static final rv5 b = new rv5();
    public final int a = 131594;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rv5 rv5Var = (rv5) obj;
        rv5Var.getClass();
        return this.a - rv5Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rv5 rv5Var = obj instanceof rv5 ? (rv5) obj : null;
        return rv5Var != null && this.a == rv5Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.10";
    }
}
