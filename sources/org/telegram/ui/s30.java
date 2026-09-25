package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class s30 extends s4.j {
    public final /* synthetic */ d60 F;

    public s30(d60 d60Var) {
        this.F = d60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        d60 d60Var = this.F;
        d60Var.Q.invalidate();
        d60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
        d60.J0(d60Var);
    }
}
