package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.bi0 {
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
