package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s60 extends sg.k0 {
    public final /* synthetic */ t60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(t60 t60Var, t60 t60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, t60Var2, f6Var);
        this.W0 = t60Var;
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
