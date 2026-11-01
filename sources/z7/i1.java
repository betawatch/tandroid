package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class i1 {
    public final gb a;
    public final Boolean b;
    public final we c;

    public /* synthetic */ i1(q5.d dVar) {
        this.a = (gb) dVar.b;
        this.b = (Boolean) dVar.c;
        this.c = (we) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return n6.l.k(this.a, i1Var.a) && n6.l.k(this.b, i1Var.b) && n6.l.k(null, null) && n6.l.k(this.c, i1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
