package rh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import ph.d4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class f extends w51 {
    public final /* synthetic */ k K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, sl0 sl0Var, Activity activity, int i10, int i11, d4 d4Var, f6 f6Var) {
        super(sl0Var, activity, i10, i11, true, d4Var, f6Var);
        this.K = kVar;
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        k kVar = this.K;
        Activity parentActivity = kVar.getParentActivity();
        int i11 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.p2) kVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, f6Var);
        m4Var.setHeight(25);
        return new el0(m4Var);
    }
}
