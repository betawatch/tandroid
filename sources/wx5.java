// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wx5 implements Comparable {
    public static final wx5 b = new wx5();
    public final int a = 131594;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wx5 wx5Var = (wx5) obj;
        wx5Var.getClass();
        return this.a - wx5Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wx5 wx5Var = obj instanceof wx5 ? (wx5) obj : null;
        return wx5Var != null && this.a == wx5Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.10";
    }
}
