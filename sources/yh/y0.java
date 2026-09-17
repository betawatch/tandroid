package yh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
