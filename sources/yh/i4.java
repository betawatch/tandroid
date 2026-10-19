package yh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class i4 extends g.o {
    public final /* synthetic */ k4 c;

    public i4(k4 k4Var) {
        this.c = k4Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.c;
        wz wzVar = k4Var.a0;
        t61 t61Var = k4Var.e0;
        if (t61Var == null) {
            return wzVar.J;
        }
        g61 G = t61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
