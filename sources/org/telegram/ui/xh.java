package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.Components.dv {
    public final /* synthetic */ qn S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(qn qnVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList) {
        super(o2Var, activity, b6Var, arrayList);
        this.S = qnVar;
    }

    @Override // org.telegram.ui.Components.dv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        qn qnVar = this.S;
        qnVar.getClass();
        qnVar.g8(false, true, 0.0f);
    }
}
