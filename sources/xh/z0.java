package xh;

import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        nz nzVar = r1Var.j0;
        k61 k61Var = r1Var.Y;
        if (k61Var == null || i10 == 0) {
            return nzVar.J;
        }
        w51 G = k61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
