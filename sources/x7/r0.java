package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r0 {
    public final n7 a;
    public final Boolean b;
    public final i8 c;

    public /* synthetic */ r0(q5.d dVar) {
        this.a = (n7) dVar.b;
        this.b = (Boolean) dVar.c;
        this.c = (i8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return n6.l.k(this.a, r0Var.a) && n6.l.k(this.b, r0Var.b) && n6.l.k(null, null) && n6.l.k(this.c, r0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
