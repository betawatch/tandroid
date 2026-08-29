package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z50 extends cg.v0 {
    public final /* synthetic */ a60 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a60 a60Var, a60 a60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, i11, activity, a60Var2, c6Var);
        this.S0 = a60Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.S0.x0 = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        this.S0.x0 = false;
    }
}
