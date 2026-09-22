package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class r0 {
    public final o7 a;
    public final Boolean b;
    public final i8 c;

    public /* synthetic */ r0(v7.s1 s1Var) {
        this.a = (o7) s1Var.b;
        this.b = (Boolean) s1Var.d;
        this.c = (i8) s1Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return n6.l.l(this.a, r0Var.a) && n6.l.l(this.b, r0Var.b) && n6.l.l(null, null) && n6.l.l(this.c, r0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
