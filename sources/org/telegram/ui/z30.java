package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z30 implements ju0 {
    public final /* synthetic */ o50 a;

    public z30(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // org.telegram.ui.ju0
    public final /* synthetic */ TextureView G() {
        return null;
    }

    @Override // org.telegram.ui.ju0
    public final void x0(MessageObject messageObject) {
        ViewGroup viewGroup;
        o50 o50Var = this.a;
        o50Var.M.I0(true);
        o50Var.Y1.f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
    }

    @Override // org.telegram.ui.ju0
    public final void y(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }
}
