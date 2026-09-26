package y9;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a1 extends c2 {
    public final String a;

    public a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        return this.a.equals(((a1) ((c2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("User{identifier="), this.a, "}");
    }
}
