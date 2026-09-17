package yh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class y0 extends g.p {
    public final /* synthetic */ p1 c;

    public y0(p1 p1Var) {
        this.c = p1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.c;
        nz nzVar = p1Var.j0;
        v51 v51Var = p1Var.Y;
        if (v51Var == null || i10 == 0) {
            return nzVar.J;
        }
        h51 G = v51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
