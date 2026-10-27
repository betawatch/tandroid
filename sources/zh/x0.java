package zh;

import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x0 extends g.o {
    public final /* synthetic */ p1 c;

    public x0(p1 p1Var) {
        this.c = p1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.c;
        vz vzVar = p1Var.j0;
        k71 k71Var = p1Var.Y;
        if (k71Var == null || i10 == 0) {
            return vzVar.J;
        }
        u61 G = k71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? vzVar.J : i11;
    }
}
