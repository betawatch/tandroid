package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class ve {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ ve(com.google.android.gms.internal.cast.z5 z5Var) {
        this.a = (Boolean) z5Var.b;
        this.b = (Boolean) z5Var.c;
        this.c = (Boolean) z5Var.a;
        this.d = (Boolean) z5Var.d;
        this.e = (Boolean) z5Var.e;
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
