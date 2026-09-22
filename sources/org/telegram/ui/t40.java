package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t40 implements lv0 {
    public final /* synthetic */ i60 a;

    public t40(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // org.telegram.ui.lv0
    public final void D0(MessageObject messageObject) {
        ViewGroup viewGroup;
        i60 i60Var = this.a;
        i60Var.Q.J0(true);
        i60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.lv0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.lv0
    public final /* synthetic */ TextureView h0() {
        return null;
    }
}
