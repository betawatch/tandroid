package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t60 extends rg.j0 {
    public final /* synthetic */ u60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(u60 u60Var, u60 u60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, u60Var2, f6Var);
        this.W0 = u60Var;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
