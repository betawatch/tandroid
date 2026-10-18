package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zh extends org.telegram.ui.Components.aw {
    public final /* synthetic */ ai W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ai aiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = aiVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W.p;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}
