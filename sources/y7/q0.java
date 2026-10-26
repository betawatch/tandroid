package y7;

import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q0 {
    public final l7 a;
    public final Boolean b;
    public final f8 c;

    public /* synthetic */ q0(s4.d dVar) {
        this.a = (l7) dVar.b;
        this.b = (Boolean) dVar.c;
        this.c = (f8) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return o6.l.l(this.a, q0Var.a) && o6.l.l(this.b, q0Var.b) && o6.l.l(null, null) && o6.l.l(this.c, q0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
