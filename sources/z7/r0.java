package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r0 {
    public final m7 a;
    public final Boolean b;
    public final g8 c;

    public /* synthetic */ r0(q0 q0Var) {
        this.a = (m7) q0Var.b;
        this.b = (Boolean) q0Var.c;
        this.c = (g8) q0Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p6.m.k(this.a, r0Var.a) && p6.m.k(this.b, r0Var.b) && p6.m.k(null, null) && p6.m.k(this.c, r0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
