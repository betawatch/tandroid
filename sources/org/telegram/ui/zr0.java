package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zr0 extends org.telegram.ui.Components.oy0 {
    public final /* synthetic */ as0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(as0 as0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.v0 = as0Var;
    }

    @Override // org.telegram.ui.Components.oy0, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.v0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
