package xh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class j4 extends g.p {
    public final /* synthetic */ l4 c;

    public j4(l4 l4Var) {
        this.c = l4Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.c;
        nz nzVar = l4Var.a0;
        w51 w51Var = l4Var.e0;
        if (w51Var == null) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
