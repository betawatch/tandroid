package yh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class x0 extends g.o {
    public final /* synthetic */ o1 c;

    public x0(o1 o1Var) {
        this.c = o1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        o1 o1Var = this.c;
        wz wzVar = o1Var.j0;
        u61 u61Var = o1Var.Y;
        if (u61Var == null || i10 == 0) {
            return wzVar.J;
        }
        h61 G = u61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
