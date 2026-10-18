package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class j4 extends g.o {
    public final /* synthetic */ l4 c;

    public j4(l4 l4Var) {
        this.c = l4Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.c;
        wz wzVar = l4Var.a0;
        s61 s61Var = l4Var.e0;
        if (s61Var == null) {
            return wzVar.J;
        }
        f61 G = s61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
