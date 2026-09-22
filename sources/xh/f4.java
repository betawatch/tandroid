package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class f4 extends m61 {
    public final /* synthetic */ h4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, yl0 yl0Var, Context context, int i10, hi.a aVar, f6 f6Var) {
        super(yl0Var, context, i10, 0, false, aVar, f6Var);
        this.N = h4Var;
    }

    @Override // org.telegram.ui.Components.m61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        h4 h4Var = this.N;
        if (i10 == 0) {
            Context context = h4Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
            return new il0(new org.telegram.ui.Cells.n4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = h4Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
        return new il0(new org.telegram.ui.Cells.n4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
