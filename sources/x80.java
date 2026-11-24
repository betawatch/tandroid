// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x80 extends zj2 {
    public final u80 a;

    public x80(u80 u80Var) {
        this.a = u80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zj2)) {
            return false;
        }
        zj2 zj2Var = (zj2) obj;
        Object obj2 = yj2.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((x80) zj2Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((yj2.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + yj2.a + ", androidClientInfo=" + this.a + "}";
    }
}
