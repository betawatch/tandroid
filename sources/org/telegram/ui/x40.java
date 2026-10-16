package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x40 implements rv0 {
    public final /* synthetic */ n60 a;

    public x40(n60 n60Var) {
        this.a = n60Var;
    }

    @Override // org.telegram.ui.rv0
    public final void C0(MessageObject messageObject) {
        ViewGroup viewGroup;
        n60 n60Var = this.a;
        n60Var.Q.I0(true);
        n60Var.c2.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.rv0
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.a).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.rv0
    public final /* synthetic */ TextureView g0() {
        return null;
    }
}
