package wh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e4 extends j61 {
    public final /* synthetic */ g4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, vl0 vl0Var, Context context, int i10, gi.a aVar, f6 f6Var) {
        super(vl0Var, context, i10, 0, false, aVar, f6Var);
        this.N = g4Var;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        g4 g4Var = this.N;
        if (i10 == 0) {
            Context context = g4Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.h3) g4Var).resourcesProvider;
            return new fl0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = g4Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.h3) g4Var).resourcesProvider;
        return new fl0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
