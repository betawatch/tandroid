package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
