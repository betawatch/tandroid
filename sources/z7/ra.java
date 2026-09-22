package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class ra {
    public final qa a;
    public final Integer b;

    public /* synthetic */ ra(org.telegram.ui.Cells.f3 f3Var) {
        this.a = (qa) f3Var.b;
        this.b = (Integer) f3Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return n6.l.l(this.a, raVar.a) && n6.l.l(this.b, raVar.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
