// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pi4 {
    public final String a;
    public final String b;

    public pi4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi4)) {
            return false;
        }
        pi4 pi4Var = (pi4) obj;
        return rr5.a(this.a, pi4Var.a) && rr5.a(this.b, pi4Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.a + ", authToken=" + this.b + ')';
    }
}
