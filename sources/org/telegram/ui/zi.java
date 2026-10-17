package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zi extends org.telegram.ui.Components.aw {
    public final /* synthetic */ sn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(sn snVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = snVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}
