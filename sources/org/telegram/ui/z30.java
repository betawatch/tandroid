package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z30 extends s4.j {
    public final /* synthetic */ k60 F;

    public z30(k60 k60Var) {
        this.F = k60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        k60 k60Var = this.F;
        k60Var.Q.invalidate();
        k60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
        k60.J0(k60Var);
    }
}
