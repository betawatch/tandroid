// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t90 extends i03 {
    public final u90 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final h03 e;
    public final List f;
    public final int g;

    public t90(u90 u90Var, List list, List list2, Boolean bool, h03 h03Var, List list3, int i) {
        this.a = u90Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = h03Var;
        this.f = list3;
        this.g = i;
    }

    public final s90 a() {
        s90 s90Var = new s90();
        s90Var.a = this.a;
        s90Var.b = this.b;
        s90Var.c = this.c;
        s90Var.d = this.d;
        s90Var.e = this.e;
        s90Var.f = this.f;
        s90Var.g = this.g;
        s90Var.h = (byte) 1;
        return s90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i03)) {
            return false;
        }
        t90 t90Var = (t90) ((i03) obj);
        if (!this.a.equals(t90Var.a)) {
            return false;
        }
        List list = t90Var.b;
        List list2 = this.b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = t90Var.c;
        List list4 = this.c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = t90Var.d;
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        h03 h03Var = t90Var.e;
        h03 h03Var2 = this.e;
        if (h03Var2 == null) {
            if (h03Var != null) {
                return false;
            }
        } else if (!h03Var2.equals(h03Var)) {
            return false;
        }
        List list5 = t90Var.f;
        List list6 = this.f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.g == t90Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        h03 h03Var = this.e;
        int hashCode5 = (hashCode4 ^ (h03Var == null ? 0 : h03Var.hashCode())) * 1000003;
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
        return hg9.k(sb, this.g, "}");
    }
}
