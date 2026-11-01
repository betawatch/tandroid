package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.Components.dx0 {
    public final /* synthetic */ yp0 o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(yp0 yp0Var, Activity activity, org.telegram.messenger.kj kjVar, TLObject tLObject, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, kjVar, tLObject, p6Var);
        this.o2 = yp0Var;
    }

    @Override // org.telegram.ui.Components.dx0, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.o2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
