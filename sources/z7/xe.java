package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class xe {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ xe(com.google.android.gms.internal.cast.z5 z5Var) {
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
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return n6.l.l(this.a, xeVar.a) && n6.l.l(this.b, xeVar.b) && n6.l.l(this.c, xeVar.c) && n6.l.l(this.d, xeVar.d) && n6.l.l(this.e, xeVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
