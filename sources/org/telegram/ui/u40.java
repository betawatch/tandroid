package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u40 implements nv0 {
    public final /* synthetic */ j60 a;

    public u40(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // org.telegram.ui.nv0
    public final void D0(MessageObject messageObject) {
        ViewGroup viewGroup;
        j60 j60Var = this.a;
        j60Var.Q.I0(true);
        j60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.nv0
    public final void G(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.nv0
    public final /* synthetic */ TextureView g0() {
        return null;
    }
}
