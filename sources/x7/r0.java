package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class r0 {
    public final n7 a;
    public final Boolean b;
    public final h8 c;

    public /* synthetic */ r0(v7.a6 a6Var) {
        this.a = (n7) a6Var.b;
        this.b = (Boolean) a6Var.d;
        this.c = (h8) a6Var.c;
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
