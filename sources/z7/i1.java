package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class i1 {
    public final ib a;
    public final Boolean b;
    public final xe c;

    public /* synthetic */ i1(u2.c cVar) {
        this.a = (ib) cVar.b;
        this.b = (Boolean) cVar.c;
        this.c = (xe) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return n6.l.l(this.a, i1Var.a) && n6.l.l(this.b, i1Var.b) && n6.l.l(null, null) && n6.l.l(this.c, i1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
