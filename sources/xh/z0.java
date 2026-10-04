package xh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class z0 extends g.p {
    public final /* synthetic */ q1 c;

    public z0(q1 q1Var) {
        this.c = q1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.c;
        qz qzVar = q1Var.j0;
        u61 u61Var = q1Var.Y;
        if (u61Var == null || i10 == 0) {
            return qzVar.J;
        }
        g61 G = u61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? qzVar.J : i11;
    }
}
