package xh;

import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.p61;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k4 extends g.o {
    public final /* synthetic */ m4 c;

    public k4(m4 m4Var) {
        this.c = m4Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.c;
        d00 d00Var = m4Var.a0;
        c71 c71Var = m4Var.e0;
        if (c71Var == null) {
            return d00Var.J;
        }
        p61 G = c71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? d00Var.J : i11;
    }
}
