// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sx7 {
    public final Object a;
    public final Object b;

    public sx7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sx7)) {
            return false;
        }
        sx7 sx7Var = (sx7) obj;
        return Objects.equals(sx7Var.a, this.a) && Objects.equals(sx7Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
