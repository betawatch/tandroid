package yh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class y0 extends g.o {
    public final /* synthetic */ p1 c;

    public y0(p1 p1Var) {
        this.c = p1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.c;
        zz zzVar = p1Var.j0;
        z61 z61Var = p1Var.Y;
        if (z61Var == null || i10 == 0) {
            return zzVar.J;
        }
        l61 G = z61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? zzVar.J : i11;
    }
}
