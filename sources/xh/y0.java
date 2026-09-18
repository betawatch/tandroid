package xh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class y0 extends g.p {
    public final /* synthetic */ q1 c;

    public y0(q1 q1Var) {
        this.c = q1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.c;
        nz nzVar = q1Var.j0;
        x51 x51Var = q1Var.Y;
        if (x51Var == null || i10 == 0) {
            return nzVar.J;
        }
        j51 G = x51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
