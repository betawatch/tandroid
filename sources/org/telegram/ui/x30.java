package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.zh0 {
    public final /* synthetic */ d60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(d60 d60Var, LaunchActivity launchActivity, z40 z40Var, j50 j50Var, w30 w30Var) {
        super(launchActivity, z40Var, j50Var, w30Var);
        this.s1 = d60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
