// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
