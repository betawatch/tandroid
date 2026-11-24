// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wk2 {
    public final String a;
    public final String b;

    public wk2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wk2)) {
            return false;
        }
        wk2 wk2Var = (wk2) obj;
        return this.a.equals(wk2Var.a) && this.b.equals(wk2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
