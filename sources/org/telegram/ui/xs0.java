package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.Components.uy0 {
    public final /* synthetic */ ys0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(ys0 ys0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.v0 = ys0Var;
    }

    @Override // org.telegram.ui.Components.uy0, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.v0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
