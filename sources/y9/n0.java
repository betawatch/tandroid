package y9;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n0 extends s1 {
    public final List a;
    public final o1 b;
    public final g1 c;
    public final p1 d;
    public final List e;

    public n0(List list, p0 p0Var, g1 g1Var, q0 q0Var, List list2) {
        this.a = list;
        this.b = p0Var;
        this.c = g1Var;
        this.d = q0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            List list = this.a;
            if (list != null ? list.equals(((n0) s1Var).a) : ((n0) s1Var).a == null) {
                o1 o1Var = this.b;
                if (o1Var != null ? o1Var.equals(((n0) s1Var).b) : ((n0) s1Var).b == null) {
                    g1 g1Var = this.c;
                    if (g1Var != null ? g1Var.equals(((n0) s1Var).c) : ((n0) s1Var).c == null) {
                        n0 n0Var = (n0) s1Var;
                        if (this.d.equals(n0Var.d) && this.e.equals(n0Var.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        o1 o1Var = this.b;
        int hashCode2 = (hashCode ^ (o1Var == null ? 0 : o1Var.hashCode())) * 1000003;
        g1 g1Var = this.c;
        return (((((g1Var != null ? g1Var.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
