package rh;

import android.app.Activity;
import android.view.ViewGroup;
import f2.m1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import qh.c4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d extends w51 {
    public final /* synthetic */ g K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, sl0 sl0Var, Activity activity, int i10, int i11, c4 c4Var, g6 g6Var) {
        super(sl0Var, activity, i10, i11, true, c4Var, g6Var);
        this.K = gVar;
    }

    @Override // org.telegram.ui.Components.w51, f2.p0
    public final m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        g gVar = this.K;
        Activity parentActivity = gVar.getParentActivity();
        int i11 = k6.L6;
        g6Var = ((p2) gVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, g6Var);
        m4Var.setHeight(25);
        return new el0(m4Var);
    }
}
