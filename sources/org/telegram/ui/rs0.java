package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class rs0 extends org.telegram.ui.Components.hy0 {
    public final /* synthetic */ ss0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(ss0 ss0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, messageObject, tLObject, e6Var);
        this.v0 = ss0Var;
    }

    @Override // org.telegram.ui.Components.hy0, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.v0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
