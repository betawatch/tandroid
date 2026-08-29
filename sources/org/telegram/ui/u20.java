package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u20 extends f2.l {
    public final /* synthetic */ r50 F;

    public u20(r50 r50Var) {
        this.F = r50Var;
    }

    @Override // f2.l
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        r50 r50Var = this.F;
        r50Var.M.invalidate();
        r50Var.W1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
        r50.J0(r50Var);
    }
}
