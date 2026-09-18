package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class e4 extends x51 {
    public final /* synthetic */ g4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, ml0 ml0Var, Context context, int i10, hi.a aVar, f6 f6Var) {
        super(ml0Var, context, i10, 0, false, aVar, f6Var);
        this.N = g4Var;
    }

    @Override // org.telegram.ui.Components.x51, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.g3) g4Var).resourcesProvider;
            return new wk0(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = g4Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.g3) g4Var).resourcesProvider;
        return new wk0(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
