package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class ve {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ve(ci.u5 u5Var) {
        this.a = (Boolean) u5Var.a;
        this.b = (Boolean) u5Var.b;
        this.c = (Boolean) u5Var.c;
        this.d = (Boolean) u5Var.d;
        this.e = (Boolean) u5Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return n6.l.l(this.a, veVar.a) && n6.l.l(this.b, veVar.b) && n6.l.l(this.c, veVar.c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
