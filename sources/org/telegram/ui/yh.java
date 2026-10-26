package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yh extends org.telegram.ui.Components.aw {
    public final /* synthetic */ zh W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(zh zhVar, org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, activity, u6Var, arrayList);
        this.W = zhVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        un unVar = this.W.p;
        unVar.getClass();
        unVar.n8(false, true, 0.0f);
    }
}
