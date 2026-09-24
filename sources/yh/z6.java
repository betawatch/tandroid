package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class z6 extends j61 {
    public final /* synthetic */ w7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(w7 w7Var, wl0 wl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(wl0Var, activity, i10, i11, true, aVar, d6Var);
        this.N = w7Var;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
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
        return new gl0(m4Var);
    }
}
