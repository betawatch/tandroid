// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wn2 extends tl5 {
    public final String b;
    public final String c;
    public final String d;

    public wn2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wn2.class != obj.getClass()) {
            return false;
        }
        wn2 wn2Var = (wn2) obj;
        return this.c.equals(wn2Var.c) && this.b.equals(wn2Var.b) && Objects.equals(this.d, wn2Var.d);
    }

    public final int hashCode() {
        int j = ts2.j(ts2.j(527, 31, this.b), 31, this.c);
        String str = this.d;
        return j + (str != null ? str.hashCode() : 0);
    }

    @Override // tl5
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
