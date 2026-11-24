// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t80 extends xy2 {
    public final u80 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final wy2 e;
    public final List f;
    public final int g;

    public t80(u80 u80Var, List list, List list2, Boolean bool, wy2 wy2Var, List list3, int i) {
        this.a = u80Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = wy2Var;
        this.f = list3;
        this.g = i;
    }

    public final s80 a() {
        s80 s80Var = new s80();
        s80Var.a = this.a;
        s80Var.b = this.b;
        s80Var.c = this.c;
        s80Var.d = this.d;
        s80Var.e = this.e;
        s80Var.f = this.f;
        s80Var.g = this.g;
        s80Var.h = (byte) 1;
        return s80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xy2)) {
            return false;
        }
        t80 t80Var = (t80) ((xy2) obj);
        if (!this.a.equals(t80Var.a)) {
            return false;
        }
        List list = t80Var.b;
        List list2 = this.b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = t80Var.c;
        List list4 = this.c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = t80Var.d;
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        wy2 wy2Var = t80Var.e;
        wy2 wy2Var2 = this.e;
        if (wy2Var2 == null) {
            if (wy2Var != null) {
                return false;
            }
        } else if (!wy2Var2.equals(wy2Var)) {
            return false;
        }
        List list5 = t80Var.f;
        List list6 = this.f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.g == t80Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        wy2 wy2Var = this.e;
        int hashCode5 = (hashCode4 ^ (wy2Var == null ? 0 : wy2Var.hashCode())) * 1000003;
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
        return de9.l(sb, this.g, "}");
    }
}
