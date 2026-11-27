// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z70 extends hj2 {
    public final w70 a;

    public z70(w70 w70Var) {
        this.a = w70Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hj2)) {
            return false;
        }
        hj2 hj2Var = (hj2) obj;
        Object obj2 = gj2.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((z70) hj2Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((gj2.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + gj2.a + ", androidClientInfo=" + this.a + "}";
    }
}
