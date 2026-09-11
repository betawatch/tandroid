package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class t40 implements kv0 {
    public final /* synthetic */ j60 a;

    public t40(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // org.telegram.ui.kv0
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        j60 j60Var = this.a;
        j60Var.Q.I0(true);
        j60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.kv0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.kv0
    public final /* synthetic */ TextureView i0() {
        return null;
    }
}
