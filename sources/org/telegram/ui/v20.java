package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v20 extends s4.k {
    public final /* synthetic */ u50 F;

    public v20(u50 u50Var) {
        this.F = u50Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        u50 u50Var = this.F;
        u50Var.Q.invalidate();
        u50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
        u50.J0(u50Var);
    }
}
