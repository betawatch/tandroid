package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vr0 extends org.telegram.ui.Components.xx0 {
    public final /* synthetic */ wr0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(wr0 wr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.s0 = wr0Var;
    }

    @Override // org.telegram.ui.Components.xx0, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s0.b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
