package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wh extends org.telegram.ui.Components.cv {
    public final /* synthetic */ xh S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(xh xhVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(n2Var, activity, c6Var, arrayList);
        this.S = xhVar;
    }

    @Override // org.telegram.ui.Components.cv, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        rn rnVar = this.S.p;
        rnVar.getClass();
        rnVar.g8(false, true, 0.0f);
    }
}
