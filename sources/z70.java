// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
