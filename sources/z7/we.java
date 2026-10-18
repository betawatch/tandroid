package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class we {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ we(com.google.android.gms.internal.cast.z5 z5Var) {
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
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return n6.l.l(this.a, weVar.a) && n6.l.l(this.b, weVar.b) && n6.l.l(this.c, weVar.c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
