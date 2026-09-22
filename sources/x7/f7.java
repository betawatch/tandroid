package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class f7 {
    public final e7 a;
    public final Integer b;

    public /* synthetic */ f7(d7 d7Var) {
        this.a = (e7) d7Var.a;
        this.b = (Integer) d7Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return n6.l.l(this.a, f7Var.a) && n6.l.l(this.b, f7Var.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
