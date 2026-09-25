package xh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        oz ozVar = m4Var.a0;
        j61 j61Var = m4Var.e0;
        if (j61Var == null) {
            return ozVar.J;
        }
        v51 G = j61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? ozVar.J : i11;
    }
}
