package yh;

import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        b71 b71Var = k4Var.g0;
        if (b71Var == null) {
            return wzVar.J;
        }
        m61 G = b71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
