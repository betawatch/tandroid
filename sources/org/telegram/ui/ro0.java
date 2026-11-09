package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ro0 extends org.telegram.ui.Components.zv0 {
    public final /* synthetic */ so0 o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro0(so0 so0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, ijVar, tLObject, g6Var);
        this.o2 = so0Var;
    }

    @Override // org.telegram.ui.Components.zv0, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.o2.b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
