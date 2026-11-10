package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class so0 extends org.telegram.ui.Components.yv0 {
    public final /* synthetic */ to0 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(to0 to0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, ijVar, tLObject, h6Var);
        this.r2 = to0Var;
    }

    @Override // org.telegram.ui.Components.yv0, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.r2.b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
