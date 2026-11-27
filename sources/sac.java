// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sac extends wl5 {
    public final String b;
    public final String c;

    public sac(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sac.class != obj.getClass()) {
            return false;
        }
        sac sacVar = (sac) obj;
        return this.a.equals(sacVar.a) && Objects.equals(this.b, sacVar.b) && this.c.equals(sacVar.c);
    }

    public final int hashCode() {
        int j = bs2.j(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
