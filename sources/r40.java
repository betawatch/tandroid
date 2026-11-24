// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r40 {
    public final go4 a;
    public final io5 b;
    public final bqb c;
    public final rz6 d;

    public r40(e7a e7aVar) {
        this.a = (go4) e7aVar.a;
        this.b = (io5) e7aVar.b;
        this.c = (bqb) e7aVar.c;
        this.d = (rz6) e7aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r40)) {
            return false;
        }
        r40 r40Var = (r40) obj;
        return this.a.equals(r40Var.a) && Objects.equals(this.b, r40Var.b) && this.c.equals(r40Var.c) && Objects.equals(this.d, r40Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        io5 io5Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (io5Var == null ? 0 : io5Var.hashCode())) * 31)) * 31;
        rz6 rz6Var = this.d;
        return hashCode2 + (rz6Var != null ? rz6Var.hashCode() : 0);
    }
}
