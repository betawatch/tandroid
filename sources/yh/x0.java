package yh;

import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        b71 b71Var = o1Var.Y;
        if (b71Var == null || i10 == 0) {
            return wzVar.J;
        }
        m61 G = b71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
