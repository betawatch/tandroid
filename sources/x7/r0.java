package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class r0 {
    public final n7 a;
    public final Boolean b;
    public final h8 c;

    public /* synthetic */ r0(v7.k kVar) {
        this.a = (n7) kVar.b;
        this.b = (Boolean) kVar.c;
        this.c = (h8) kVar.d;
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
