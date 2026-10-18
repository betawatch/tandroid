package yh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e4 extends s61 {
    public final /* synthetic */ g4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, im0 im0Var, Context context, int i10, u3 u3Var, d6 d6Var) {
        super(im0Var, context, i10, 0, false, u3Var, d6Var);
        this.N = g4Var;
    }

    @Override // org.telegram.ui.Components.s61, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = h6.L6;
            d6Var2 = ((org.telegram.ui.ActionBar.f3) g4Var).resourcesProvider;
            return new sl0(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, d6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = g4Var.getContext();
        int i12 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.f3) g4Var).resourcesProvider;
        return new sl0(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, d6Var));
    }
}
