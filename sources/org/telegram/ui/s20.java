package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class s20 extends s4.k {
    public final /* synthetic */ q50 F;

    public s20(q50 q50Var) {
        this.F = q50Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        q50 q50Var = this.F;
        q50Var.Q.invalidate();
        q50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
        q50.K0(q50Var);
    }
}
