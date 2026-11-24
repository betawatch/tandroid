// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u80 extends vy2 {
    public final List a;
    public final w80 b;
    public final hy2 c;
    public final my2 d;
    public final x80 e;
    public final List f;

    public u80(List list, w80 w80Var, hy2 hy2Var, my2 my2Var, x80 x80Var, List list2) {
        this.a = list;
        this.b = w80Var;
        this.c = hy2Var;
        this.d = my2Var;
        this.e = x80Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2Var = (vy2) obj;
        List list = this.a;
        if (list == null) {
            if (((u80) vy2Var).a != null) {
                return false;
            }
        } else if (!list.equals(((u80) vy2Var).a)) {
            return false;
        }
        w80 w80Var = this.b;
        if (w80Var == null) {
            if (((u80) vy2Var).b != null) {
                return false;
            }
        } else if (!w80Var.equals(((u80) vy2Var).b)) {
            return false;
        }
        hy2 hy2Var = this.c;
        if (hy2Var == null) {
            if (((u80) vy2Var).c != null) {
                return false;
            }
        } else if (!hy2Var.equals(((u80) vy2Var).c)) {
            return false;
        }
        my2 my2Var = this.d;
        if (my2Var == null) {
            if (((u80) vy2Var).d != null) {
                return false;
            }
        } else if (!my2Var.equals(((u80) vy2Var).d)) {
            return false;
        }
        u80 u80Var = (u80) vy2Var;
        return this.e.equals(u80Var.e) && this.f.equals(u80Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        w80 w80Var = this.b;
        int hashCode2 = (hashCode ^ (w80Var == null ? 0 : w80Var.hashCode())) * 1000003;
        hy2 hy2Var = this.c;
        int hashCode3 = (hashCode2 ^ (hy2Var == null ? 0 : hy2Var.hashCode())) * 1000003;
        my2 my2Var = this.d;
        return ((((hashCode3 ^ (my2Var != null ? my2Var.hashCode() : 0)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }
}
