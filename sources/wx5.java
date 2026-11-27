// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
