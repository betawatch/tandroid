package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class ra {
    public final qa a;
    public final Integer b;

    public /* synthetic */ ra(n7.a1 a1Var) {
        this.a = (qa) a1Var.b;
        this.b = (Integer) a1Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return n6.l.l(this.a, raVar.a) && n6.l.l(this.b, raVar.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
