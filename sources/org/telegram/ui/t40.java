package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t40 implements gv0 {
    public final /* synthetic */ h60 a;

    public t40(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // org.telegram.ui.gv0
    public final void G0(MessageObject messageObject) {
        ViewGroup viewGroup;
        h60 h60Var = this.a;
        h60Var.Q.J0(true);
        h60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.gv0
    public final void I(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.gv0
    public final /* synthetic */ TextureView k0() {
        return null;
    }
}
