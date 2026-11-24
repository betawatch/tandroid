// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
