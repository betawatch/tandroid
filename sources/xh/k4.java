package xh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        v51 v51Var = m4Var.e0;
        if (v51Var == null) {
            return ozVar.J;
        }
        h51 G = v51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? ozVar.J : i11;
    }
}
