// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rx5 implements Comparable {
    public static final rx5 b = new rx5();
    public final int a = 131594;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rx5 rx5Var = (rx5) obj;
        rx5Var.getClass();
        return this.a - rx5Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rx5 rx5Var = obj instanceof rx5 ? (rx5) obj : null;
        return rx5Var != null && this.a == rx5Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.10";
    }
}
