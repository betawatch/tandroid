package xh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class z0 extends g.p {
    public final /* synthetic */ r1 c;

    public z0(r1 r1Var) {
        this.c = r1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.c;
        oz ozVar = r1Var.j0;
        j61 j61Var = r1Var.Y;
        if (j61Var == null || i10 == 0) {
            return ozVar.J;
        }
        v51 G = j61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? ozVar.J : i11;
    }
}
