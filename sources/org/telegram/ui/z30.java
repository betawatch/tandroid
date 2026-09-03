package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z30 extends org.telegram.ui.Components.wh0 {
    public final /* synthetic */ e60 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(e60 e60Var, LaunchActivity launchActivity, b50 b50Var, l50 l50Var, y30 y30Var) {
        super(launchActivity, b50Var, l50Var, y30Var);
        this.p1 = e60Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.p1).containerView;
        viewGroup.invalidate();
    }
}
