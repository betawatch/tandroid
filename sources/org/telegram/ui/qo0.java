package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class qo0 extends org.telegram.ui.Components.kw0 {
    public final /* synthetic */ ro0 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo0(ro0 ro0Var, Activity activity, org.telegram.messenger.fj fjVar, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, fjVar, tLObject, h6Var);
        this.s2 = ro0Var;
    }

    @Override // org.telegram.ui.Components.kw0, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
