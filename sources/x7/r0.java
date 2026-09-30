package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class r0 {
    public final n7 a;
    public final Boolean b;
    public final h8 c;

    public /* synthetic */ r0(v7.l lVar) {
        this.a = (n7) lVar.b;
        this.b = (Boolean) lVar.c;
        this.c = (h8) lVar.d;
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
