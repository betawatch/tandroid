// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t8c extends tl5 {
    public final String b;
    public final String c;

    public t8c(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t8c.class != obj.getClass()) {
            return false;
        }
        t8c t8cVar = (t8c) obj;
        return this.a.equals(t8cVar.a) && Objects.equals(this.b, t8cVar.b) && this.c.equals(t8cVar.c);
    }

    public final int hashCode() {
        int j = ts2.j(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // tl5
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
