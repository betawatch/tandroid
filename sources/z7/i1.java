package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class i1 {
    public final hb a;
    public final Boolean b;
    public final we c;

    public /* synthetic */ i1(u2.c cVar) {
        this.a = (hb) cVar.b;
        this.b = (Boolean) cVar.c;
        this.c = (we) cVar.d;
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
