// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class v80 extends sz2 {
    public final w80 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final rz2 e;
    public final List f;
    public final int g;

    public v80(w80 w80Var, List list, List list2, Boolean bool, rz2 rz2Var, List list3, int i) {
        this.a = w80Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = rz2Var;
        this.f = list3;
        this.g = i;
    }

    public final u80 a() {
        u80 u80Var = new u80();
        u80Var.a = this.a;
        u80Var.b = this.b;
        u80Var.c = this.c;
        u80Var.d = this.d;
        u80Var.e = this.e;
        u80Var.f = this.f;
        u80Var.g = this.g;
        u80Var.h = (byte) 1;
        return u80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sz2)) {
            return false;
        }
        v80 v80Var = (v80) ((sz2) obj);
        if (!this.a.equals(v80Var.a)) {
            return false;
        }
        List list = v80Var.b;
        List list2 = this.b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = v80Var.c;
        List list4 = this.c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = v80Var.d;
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        rz2 rz2Var = v80Var.e;
        rz2 rz2Var2 = this.e;
        if (rz2Var2 == null) {
            if (rz2Var != null) {
                return false;
            }
        } else if (!rz2Var2.equals(rz2Var)) {
            return false;
        }
        List list5 = v80Var.f;
        List list6 = this.f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.g == v80Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        rz2 rz2Var = this.e;
        int hashCode5 = (hashCode4 ^ (rz2Var == null ? 0 : rz2Var.hashCode())) * 1000003;
        List list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return uh9.l(sb, this.g, "}");
    }
}
