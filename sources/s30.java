// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class s30 {
    public final ko4 a;
    public final lo5 b;
    public final asb c;
    public final vz6 d;

    public s30(u8a u8aVar) {
        this.a = (ko4) u8aVar.a;
        this.b = (lo5) u8aVar.b;
        this.c = (asb) u8aVar.c;
        this.d = (vz6) u8aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj;
        return this.a.equals(s30Var.a) && Objects.equals(this.b, s30Var.b) && this.c.equals(s30Var.c) && Objects.equals(this.d, s30Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        lo5 lo5Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (lo5Var == null ? 0 : lo5Var.hashCode())) * 31)) * 31;
        vz6 vz6Var = this.d;
        return hashCode2 + (vz6Var != null ? vz6Var.hashCode() : 0);
    }
}
