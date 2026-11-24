// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u90 extends g03 {
    public final List a;
    public final w90 b;
    public final sz2 c;
    public final xz2 d;
    public final x90 e;
    public final List f;

    public u90(List list, w90 w90Var, sz2 sz2Var, xz2 xz2Var, x90 x90Var, List list2) {
        this.a = list;
        this.b = w90Var;
        this.c = sz2Var;
        this.d = xz2Var;
        this.e = x90Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g03)) {
            return false;
        }
        g03 g03Var = (g03) obj;
        List list = this.a;
        if (list == null) {
            if (((u90) g03Var).a != null) {
                return false;
            }
        } else if (!list.equals(((u90) g03Var).a)) {
            return false;
        }
        w90 w90Var = this.b;
        if (w90Var == null) {
            if (((u90) g03Var).b != null) {
                return false;
            }
        } else if (!w90Var.equals(((u90) g03Var).b)) {
            return false;
        }
        sz2 sz2Var = this.c;
        if (sz2Var == null) {
            if (((u90) g03Var).c != null) {
                return false;
            }
        } else if (!sz2Var.equals(((u90) g03Var).c)) {
            return false;
        }
        xz2 xz2Var = this.d;
        if (xz2Var == null) {
            if (((u90) g03Var).d != null) {
                return false;
            }
        } else if (!xz2Var.equals(((u90) g03Var).d)) {
            return false;
        }
        u90 u90Var = (u90) g03Var;
        return this.e.equals(u90Var.e) && this.f.equals(u90Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        w90 w90Var = this.b;
        int hashCode2 = (hashCode ^ (w90Var == null ? 0 : w90Var.hashCode())) * 1000003;
        sz2 sz2Var = this.c;
        int hashCode3 = (hashCode2 ^ (sz2Var == null ? 0 : sz2Var.hashCode())) * 1000003;
        xz2 xz2Var = this.d;
        return ((((hashCode3 ^ (xz2Var != null ? xz2Var.hashCode() : 0)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }
}
