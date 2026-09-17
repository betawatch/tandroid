package yh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class i4 extends g.p {
    public final /* synthetic */ k4 c;

    public i4(k4 k4Var) {
        this.c = k4Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.c;
        nz nzVar = k4Var.a0;
        v51 v51Var = k4Var.e0;
        if (v51Var == null) {
            return nzVar.J;
        }
        h51 G = v51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
