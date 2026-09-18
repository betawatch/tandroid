package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class b7 extends x51 {
    public final /* synthetic */ y7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(y7 y7Var, ml0 ml0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(ml0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = y7Var;
    }

    @Override // org.telegram.ui.Components.x51, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        y7 y7Var = this.N;
        Activity parentActivity = y7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.o2) y7Var).resourceProvider;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, f6Var);
        l4Var.setHeight(25);
        return new wk0(l4Var);
    }
}
