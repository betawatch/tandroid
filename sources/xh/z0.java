package xh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        oz ozVar = r1Var.j0;
        v51 v51Var = r1Var.Y;
        if (v51Var == null || i10 == 0) {
            return ozVar.J;
        }
        h51 G = v51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? ozVar.J : i11;
    }
}
