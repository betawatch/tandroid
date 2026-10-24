package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class i1 {
    public final gb a;
    public final Boolean b;
    public final ve c;

    public /* synthetic */ i1(u2.c cVar) {
        this.a = (gb) cVar.b;
        this.b = (Boolean) cVar.c;
        this.c = (ve) cVar.d;
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
