package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class z6 extends l61 {
    public final /* synthetic */ w7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(w7 w7Var, yl0 yl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(yl0Var, activity, i10, i11, true, aVar, d6Var);
        this.N = w7Var;
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        w7 w7Var = this.N;
        Activity parentActivity = w7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.m2) w7Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new il0(m4Var);
    }
}
