package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t30 extends f2.l {
    public final /* synthetic */ d60 F;

    public t30(d60 d60Var) {
        this.F = d60Var;
    }

    @Override // f2.l
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        d60 d60Var = this.F;
        d60Var.N.invalidate();
        d60Var.X1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
        d60.J0(d60Var);
    }
}
