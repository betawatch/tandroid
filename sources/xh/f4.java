package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class f4 extends v51 {
    public final /* synthetic */ h4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, ml0 ml0Var, Context context, int i10, hi.a aVar, d6 d6Var) {
        super(ml0Var, context, i10, 0, false, aVar, d6Var);
        this.N = h4Var;
    }

    @Override // org.telegram.ui.Components.v51, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        h4 h4Var = this.N;
        if (i10 == 0) {
            Context context = h4Var.getContext();
            int i11 = h6.L6;
            d6Var2 = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
            return new wk0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, d6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = h4Var.getContext();
        int i12 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
        return new wk0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, d6Var));
    }
}
