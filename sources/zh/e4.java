package zh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e4 extends j71 {
    public final /* synthetic */ g4 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, mm0 mm0Var, Context context, int i10, q0 q0Var, u6 u6Var) {
        super(mm0Var, context, i10, 0, false, q0Var, u6Var);
        this.P = g4Var;
    }

    @Override // org.telegram.ui.Components.j71, s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        u6 u6Var2;
        g4 g4Var = this.P;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = y6.L6;
            u6Var2 = ((org.telegram.ui.ActionBar.k3) g4Var).resourcesProvider;
            return new vl0(new org.telegram.ui.Cells.q4(context, i11, 13, 12, 4, false, false, u6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = g4Var.getContext();
        int i12 = y6.L6;
        u6Var = ((org.telegram.ui.ActionBar.k3) g4Var).resourcesProvider;
        return new vl0(new org.telegram.ui.Cells.q4(context2, i12, 13, 12, 4, false, true, u6Var));
    }
}
