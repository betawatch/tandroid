package xh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        pz pzVar = r1Var.j0;
        l61 l61Var = r1Var.Y;
        if (l61Var == null || i10 == 0) {
            return pzVar.J;
        }
        x51 G = l61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}
