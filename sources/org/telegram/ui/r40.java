package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r40 implements mv0 {
    public final /* synthetic */ g60 a;

    public r40(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // org.telegram.ui.mv0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.mv0
    public final /* synthetic */ TextureView d0() {
        return null;
    }

    @Override // org.telegram.ui.mv0
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        g60 g60Var = this.a;
        g60Var.Q.I0(true);
        g60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.invalidate();
    }
}
