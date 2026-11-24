// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s90 extends h74 {
    public final Integer a;

    public s90(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h74)) {
            return false;
        }
        Integer num = this.a;
        s90 s90Var = (s90) ((h74) obj);
        return num == null ? s90Var.a == null : num.equals(s90Var.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return 1000003 ^ (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
