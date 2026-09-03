package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
