package xh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class j4 extends g.p {
    public final /* synthetic */ l4 c;

    public j4(l4 l4Var) {
        this.c = l4Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.c;
        nz nzVar = l4Var.a0;
        x51 x51Var = l4Var.e0;
        if (x51Var == null) {
            return nzVar.J;
        }
        j51 G = x51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
