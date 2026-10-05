package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class x30 extends s4.j {
    public final /* synthetic */ h60 F;

    public x30(h60 h60Var) {
        this.F = h60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        h60 h60Var = this.F;
        h60Var.Q.invalidate();
        h60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60.J0(h60Var);
    }
}
