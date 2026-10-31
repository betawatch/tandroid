package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.Components.cx0 {
    public final /* synthetic */ aq0 o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(aq0 aq0Var, Activity activity, org.telegram.messenger.jj jjVar, TLObject tLObject, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, jjVar, tLObject, p6Var);
        this.o2 = aq0Var;
    }

    @Override // org.telegram.ui.Components.cx0, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.o2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
