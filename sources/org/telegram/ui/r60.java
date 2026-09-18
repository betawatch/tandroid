package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class r60 extends rg.j0 {
    public final /* synthetic */ s60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(s60 s60Var, s60 s60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, i11, activity, s60Var2, e6Var);
        this.W0 = s60Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
