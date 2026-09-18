package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class i1 {
    public final gb a;
    public final Boolean b;
    public final ve c;

    public /* synthetic */ i1(v7.r1 r1Var) {
        this.a = (gb) r1Var.b;
        this.b = (Boolean) r1Var.d;
        this.c = (ve) r1Var.c;
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
