package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        s61 s61Var = o1Var.Y;
        if (s61Var == null || i10 == 0) {
            return wzVar.J;
        }
        f61 G = s61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
