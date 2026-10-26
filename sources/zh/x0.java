package zh;

import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        j71 j71Var = p1Var.Y;
        if (j71Var == null || i10 == 0) {
            return vzVar.J;
        }
        t61 G = j71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? vzVar.J : i11;
    }
}
