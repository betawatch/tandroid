package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v40 implements nv0 {
    public final /* synthetic */ k60 a;

    public v40(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // org.telegram.ui.nv0
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        k60 k60Var = this.a;
        k60Var.Q.J0(true);
        k60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.nv0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.nv0
    public final /* synthetic */ TextureView j0() {
        return null;
    }
}
