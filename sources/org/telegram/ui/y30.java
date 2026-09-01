package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.Components.xh0 {
    public final /* synthetic */ d60 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(d60 d60Var, LaunchActivity launchActivity, a50 a50Var, k50 k50Var, x30 x30Var) {
        super(launchActivity, a50Var, k50Var, x30Var);
        this.p1 = d60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.p1).containerView;
        viewGroup.invalidate();
    }
}
