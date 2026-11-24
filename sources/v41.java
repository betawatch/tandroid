// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v41 extends yq7 implements Serializable {
    public final aq4 a;
    public final yq7 b;

    public v41(aq4 aq4Var, yq7 yq7Var) {
        this.a = aq4Var;
        this.b = yq7Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        aq4 aq4Var = this.a;
        return this.b.compare(aq4Var.apply(obj), aq4Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v41)) {
            return false;
        }
        v41 v41Var = (v41) obj;
        return this.a.equals(v41Var.a) && this.b.equals(v41Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
