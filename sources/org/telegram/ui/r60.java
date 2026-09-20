package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r60 extends rg.j0 {
    public final /* synthetic */ s60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(s60 s60Var, s60 s60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, s60Var2, f6Var);
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
