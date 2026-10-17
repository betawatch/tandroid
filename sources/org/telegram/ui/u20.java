package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class u20 extends s4.k {
    public final /* synthetic */ s50 F;

    public u20(s50 s50Var) {
        this.F = s50Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        s50 s50Var = this.F;
        s50Var.Q.invalidate();
        s50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
        s50.K0(s50Var);
    }
}
