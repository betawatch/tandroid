package yh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d4 extends z61 {
    public final /* synthetic */ f4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, mm0 mm0Var, Context context, int i10, ii.a aVar, c6 c6Var) {
        super(mm0Var, context, i10, 0, false, aVar, c6Var);
        this.N = f4Var;
    }

    @Override // org.telegram.ui.Components.z61, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        f4 f4Var = this.N;
        if (i10 == 0) {
            Context context = f4Var.getContext();
            int i11 = g6.L6;
            c6Var2 = ((org.telegram.ui.ActionBar.e3) f4Var).resourcesProvider;
            return new wl0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, c6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = f4Var.getContext();
        int i12 = g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.e3) f4Var).resourcesProvider;
        return new wl0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, c6Var));
    }
}
