package q3;

import j$.util.Objects;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class p extends j {
    public final String b;
    public final String c;

    public p(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && Objects.equals(this.b, pVar.b) && Objects.equals(this.c, pVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h(527, 31, this.a);
        String str = this.b;
        int hashCode = (h + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // q3.j
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
