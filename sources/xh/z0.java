package xh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class z0 extends g.p {
    public final /* synthetic */ q1 c;

    public z0(q1 q1Var) {
        this.c = q1Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.c;
        qz qzVar = q1Var.j0;
        w61 w61Var = q1Var.Y;
        if (w61Var == null || i10 == 0) {
            return qzVar.J;
        }
        h61 G = w61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? qzVar.J : i11;
    }
}
