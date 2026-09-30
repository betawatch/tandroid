package xh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
