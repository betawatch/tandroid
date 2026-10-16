package yh;

import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y0 extends g.o {
    public final /* synthetic */ p1 c;

    public y0(p1 p1Var) {
        this.c = p1Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.c;
        zz zzVar = p1Var.j0;
        a71 a71Var = p1Var.Y;
        if (a71Var == null || i10 == 0) {
            return zzVar.J;
        }
        m61 G = a71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? zzVar.J : i11;
    }
}
