package wh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        uz uzVar = p1Var.j0;
        j61 j61Var = p1Var.Y;
        if (j61Var == null || i10 == 0) {
            return uzVar.J;
        }
        v51 G = j61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? uzVar.J : i11;
    }
}
