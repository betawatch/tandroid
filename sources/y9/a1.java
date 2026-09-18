package y9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        return a4.a.s(new StringBuilder("User{identifier="), this.a, "}");
    }
}
