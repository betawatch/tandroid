// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v1d {
    public final go a;
    public final f84 b;

    public /* synthetic */ v1d(go goVar, f84 f84Var) {
        this.a = goVar;
        this.b = f84Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v1d)) {
            return false;
        }
        v1d v1dVar = (v1d) obj;
        return cqe.a(this.a, v1dVar.a) && cqe.a(this.b, v1dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        wk4 wk4Var = new wk4(this);
        wk4Var.a(this.a, "key");
        wk4Var.a(this.b, "feature");
        return wk4Var.toString();
    }
}
