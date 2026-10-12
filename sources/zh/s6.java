package zh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s6 extends z61 {
    public final /* synthetic */ p7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(p7 p7Var, mm0 mm0Var, Activity activity, int i10, int i11, ii.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(mm0Var, activity, i10, i11, true, aVar, c6Var);
        this.N = p7Var;
    }

    @Override // org.telegram.ui.Components.z61, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        p7 p7Var = this.N;
        Activity parentActivity = p7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.m2) p7Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, c6Var);
        m4Var.setHeight(25);
        return new wl0(m4Var);
    }
}
