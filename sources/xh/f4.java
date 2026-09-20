package xh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class f4 extends k61 {
    public final /* synthetic */ h4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, vl0 vl0Var, Context context, int i10, hi.a aVar, f6 f6Var) {
        super(vl0Var, context, i10, 0, false, aVar, f6Var);
        this.N = h4Var;
    }

    @Override // org.telegram.ui.Components.k61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        h4 h4Var = this.N;
        if (i10 == 0) {
            Context context = h4Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
            return new fl0(new org.telegram.ui.Cells.n4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = h4Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.f3) h4Var).resourcesProvider;
        return new fl0(new org.telegram.ui.Cells.n4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
