// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class y70 extends ip2 {
    public final t90 a;

    public y70(t90 t90Var) {
        hp2 hp2Var = hp2.a;
        this.a = t90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ip2)) {
            return false;
        }
        if (!this.a.equals(((y70) ((ip2) obj)).a)) {
            return false;
        }
        Object obj2 = hp2.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ hp2.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + hp2.a + "}";
    }
}
