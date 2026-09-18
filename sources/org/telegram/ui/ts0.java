package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Components.wx0 {
    public final /* synthetic */ us0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(us0 us0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.v0 = us0Var;
    }

    @Override // org.telegram.ui.Components.wx0, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.v0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
