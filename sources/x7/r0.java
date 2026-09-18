package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class r0 {
    public final n7 a;
    public final Boolean b;
    public final h8 c;

    public /* synthetic */ r0(v7.r1 r1Var) {
        this.a = (n7) r1Var.b;
        this.b = (Boolean) r1Var.d;
        this.c = (h8) r1Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return n6.l.l(this.a, r0Var.a) && n6.l.l(this.b, r0Var.b) && n6.l.l(null, null) && n6.l.l(this.c, r0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
