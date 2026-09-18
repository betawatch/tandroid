package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class y6 extends l61 {
    public final /* synthetic */ v7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(v7 v7Var, wl0 wl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wl0Var, activity, i10, i11, true, aVar, e6Var);
        this.N = v7Var;
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        v7 v7Var = this.N;
        Activity parentActivity = v7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        e6Var = ((org.telegram.ui.ActionBar.n2) v7Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, e6Var);
        m4Var.setHeight(25);
        return new gl0(m4Var);
    }
}
