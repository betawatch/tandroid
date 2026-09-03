package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u30 extends f2.l {
    public final /* synthetic */ e60 F;

    public u30(e60 e60Var) {
        this.F = e60Var;
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        e60 e60Var = this.F;
        e60Var.N.invalidate();
        e60Var.X1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
        e60.J0(e60Var);
    }
}
