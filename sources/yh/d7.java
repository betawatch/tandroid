package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class d7 extends w61 {
    public final /* synthetic */ z7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(z7 z7Var, zl0 zl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(zl0Var, activity, i10, i11, true, aVar, d6Var);
        this.N = z7Var;
    }

    @Override // org.telegram.ui.Components.w61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        z7 z7Var = this.N;
        Activity parentActivity = z7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) z7Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new il0(m4Var);
    }
}
