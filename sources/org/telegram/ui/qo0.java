package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qo0 extends org.telegram.ui.Components.jw0 {
    public final /* synthetic */ ro0 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo0(ro0 ro0Var, Activity activity, org.telegram.messenger.fj fjVar, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, fjVar, tLObject, i6Var);
        this.s2 = ro0Var;
    }

    @Override // org.telegram.ui.Components.jw0, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
