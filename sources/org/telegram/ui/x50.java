package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x50 extends zf.j0 {
    public final /* synthetic */ y50 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(y50 y50Var, y50 y50Var2, Activity activity, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, i10, activity, y50Var2, b6Var);
        this.S0 = y50Var;
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
