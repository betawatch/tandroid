// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w80 extends qz2 {
    public final List a;
    public final y80 b;
    public final cz2 c;
    public final hz2 d;
    public final z80 e;
    public final List f;

    public w80(List list, y80 y80Var, cz2 cz2Var, hz2 hz2Var, z80 z80Var, List list2) {
        this.a = list;
        this.b = y80Var;
        this.c = cz2Var;
        this.d = hz2Var;
        this.e = z80Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qz2)) {
            return false;
        }
        qz2 qz2Var = (qz2) obj;
        List list = this.a;
        if (list == null) {
            if (((w80) qz2Var).a != null) {
                return false;
            }
        } else if (!list.equals(((w80) qz2Var).a)) {
            return false;
        }
        y80 y80Var = this.b;
        if (y80Var == null) {
            if (((w80) qz2Var).b != null) {
                return false;
            }
        } else if (!y80Var.equals(((w80) qz2Var).b)) {
            return false;
        }
        cz2 cz2Var = this.c;
        if (cz2Var == null) {
            if (((w80) qz2Var).c != null) {
                return false;
            }
        } else if (!cz2Var.equals(((w80) qz2Var).c)) {
            return false;
        }
        hz2 hz2Var = this.d;
        if (hz2Var == null) {
            if (((w80) qz2Var).d != null) {
                return false;
            }
        } else if (!hz2Var.equals(((w80) qz2Var).d)) {
            return false;
        }
        w80 w80Var = (w80) qz2Var;
        return this.e.equals(w80Var.e) && this.f.equals(w80Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        y80 y80Var = this.b;
        int hashCode2 = (hashCode ^ (y80Var == null ? 0 : y80Var.hashCode())) * 1000003;
        cz2 cz2Var = this.c;
        int hashCode3 = (hashCode2 ^ (cz2Var == null ? 0 : cz2Var.hashCode())) * 1000003;
        hz2 hz2Var = this.d;
        return ((((hashCode3 ^ (hz2Var != null ? hz2Var.hashCode() : 0)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }
}
