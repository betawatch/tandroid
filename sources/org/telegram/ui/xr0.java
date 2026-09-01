package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xr0 extends org.telegram.ui.Components.yx0 {
    public final /* synthetic */ yr0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(yr0 yr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.s0 = yr0Var;
    }

    @Override // org.telegram.ui.Components.yx0, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s0.b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
