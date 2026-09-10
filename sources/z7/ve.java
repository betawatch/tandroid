package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class ve {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ve(bi.u6 u6Var) {
        this.a = (Boolean) u6Var.a;
        this.b = (Boolean) u6Var.b;
        this.c = (Boolean) u6Var.c;
        this.d = (Boolean) u6Var.d;
        this.e = (Boolean) u6Var.e;
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
