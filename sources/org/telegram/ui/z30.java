package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z30 extends org.telegram.ui.Components.ph0 {
    public final /* synthetic */ f60 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(f60 f60Var, LaunchActivity launchActivity, b50 b50Var, l50 l50Var, y30 y30Var) {
        super(launchActivity, b50Var, l50Var, y30Var);
        this.s1 = f60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.s1).containerView;
        viewGroup.invalidate();
    }
}
