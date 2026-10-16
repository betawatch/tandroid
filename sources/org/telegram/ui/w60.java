package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w60 extends sg.j0 {
    public final /* synthetic */ x60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(x60 x60Var, x60 x60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, i11, activity, x60Var2, c6Var);
        this.W0 = x60Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
