package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.Components.wu {
    public final /* synthetic */ an R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(an anVar, org.telegram.ui.ActionBar.e2 e2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(e2Var, activity, e6Var, arrayList);
        this.R1 = anVar;
    }

    @Override // org.telegram.ui.Components.wu, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        an anVar = this.R1;
        anVar.getClass();
        anVar.x8(false, true, 0.0f);
    }
}
