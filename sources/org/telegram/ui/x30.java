package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.vh0 {
    public final /* synthetic */ c60 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(c60 c60Var, LaunchActivity launchActivity, z40 z40Var, j50 j50Var, w30 w30Var) {
        super(launchActivity, z40Var, j50Var, w30Var);
        this.p1 = c60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.p1).containerView;
        viewGroup.invalidate();
    }
}
