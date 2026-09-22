package xh;

import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        nz nzVar = r1Var.j0;
        m61 m61Var = r1Var.Y;
        if (m61Var == null || i10 == 0) {
            return nzVar.J;
        }
        y51 G = m61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
