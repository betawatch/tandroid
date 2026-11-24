// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r30 {
    public final fm4 a;
    public final im5 b;
    public final aob c;
    public final rx6 d;

    public r30(c5a c5aVar) {
        this.a = (fm4) c5aVar.b;
        this.b = (im5) c5aVar.c;
        this.c = (aob) c5aVar.d;
        this.d = (rx6) c5aVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return this.a.equals(r30Var.a) && Objects.equals(this.b, r30Var.b) && this.c.equals(r30Var.c) && Objects.equals(this.d, r30Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        im5 im5Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (im5Var == null ? 0 : im5Var.hashCode())) * 31)) * 31;
        rx6 rx6Var = this.d;
        return hashCode2 + (rx6Var != null ? rx6Var.hashCode() : 0);
    }
}
