package zh;

import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        vz vzVar = l4Var.a0;
        j71 j71Var = l4Var.g0;
        if (j71Var == null) {
            return vzVar.J;
        }
        t61 G = j71Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? vzVar.J : i11;
    }
}
