// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y80 extends tq2 {
    public final ta0 a;

    public y80(ta0 ta0Var) {
        sq2 sq2Var = sq2.a;
        this.a = ta0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tq2)) {
            return false;
        }
        if (!this.a.equals(((y80) ((tq2) obj)).a)) {
            return false;
        }
        Object obj2 = sq2.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ sq2.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + sq2.a + "}";
    }
}
