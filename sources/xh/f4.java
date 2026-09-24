package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class f4 extends j61 {
    public final /* synthetic */ h4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, wl0 wl0Var, Context context, int i10, hi.a aVar, d6 d6Var) {
        super(wl0Var, context, i10, 0, false, aVar, d6Var);
        this.N = h4Var;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        h4 h4Var = this.N;
        if (i10 == 0) {
            Context context = h4Var.getContext();
            int i11 = h6.L6;
            d6Var2 = ((org.telegram.ui.ActionBar.e3) h4Var).resourcesProvider;
            return new gl0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, d6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = h4Var.getContext();
        int i12 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.e3) h4Var).resourcesProvider;
        return new gl0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, d6Var));
    }
}
