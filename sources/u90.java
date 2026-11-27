// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class u90 extends c84 {
    public final Integer a;

    public u90(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c84)) {
            return false;
        }
        Integer num = this.a;
        u90 u90Var = (u90) ((c84) obj);
        return num == null ? u90Var.a == null : num.equals(u90Var.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return 1000003 ^ (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
