package xh;

import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class k4 extends g.p {
    public final /* synthetic */ m4 c;

    public k4(m4 m4Var) {
        this.c = m4Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.c;
        nz nzVar = m4Var.a0;
        m61 m61Var = m4Var.e0;
        if (m61Var == null) {
            return nzVar.J;
        }
        y51 G = m61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
