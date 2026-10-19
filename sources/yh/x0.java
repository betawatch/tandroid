package yh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        t61 t61Var = o1Var.Y;
        if (t61Var == null || i10 == 0) {
            return wzVar.J;
        }
        g61 G = t61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
