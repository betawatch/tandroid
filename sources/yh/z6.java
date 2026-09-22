package yh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class z6 extends m61 {
    public final /* synthetic */ w7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(w7 w7Var, yl0 yl0Var, Activity activity, int i10, int i11, hi.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(yl0Var, activity, i10, i11, true, aVar, f6Var);
        this.N = w7Var;
    }

    @Override // org.telegram.ui.Components.m61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        w7 w7Var = this.N;
        Activity parentActivity = w7Var.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.n2) w7Var).resourceProvider;
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i11, 21, 0, false, f6Var);
        n4Var.setHeight(25);
        return new il0(n4Var);
    }
}
