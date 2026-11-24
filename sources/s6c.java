// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s6c extends uj5 {
    public final String b;
    public final String c;

    public s6c(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s6c.class != obj.getClass()) {
            return false;
        }
        s6c s6cVar = (s6c) obj;
        return this.a.equals(s6cVar.a) && Objects.equals(this.b, s6cVar.b) && this.c.equals(s6cVar.c);
    }

    public final int hashCode() {
        int j = ir2.j(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
