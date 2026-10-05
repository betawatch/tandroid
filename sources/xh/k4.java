package xh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        qz qzVar = m4Var.a0;
        w61 w61Var = m4Var.e0;
        if (w61Var == null) {
            return qzVar.J;
        }
        h61 G = w61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? qzVar.J : i11;
    }
}
