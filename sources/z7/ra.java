package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ra {
    public final qa a;
    public final Integer b;

    public /* synthetic */ ra(x7.g8 g8Var) {
        this.a = (qa) g8Var.b;
        this.b = (Integer) g8Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return n6.l.k(this.a, raVar.a) && n6.l.k(this.b, raVar.b) && n6.l.k(null, null) && n6.l.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
