package xh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c7 extends j61 {
    public final /* synthetic */ z7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(z7 z7Var, vl0 vl0Var, Activity activity, int i10, int i11, gi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(vl0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = z7Var;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        z7 z7Var = this.N;
        Activity parentActivity = z7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.p2) z7Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, f6Var);
        m4Var.setHeight(25);
        return new fl0(m4Var);
    }
}
