package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wi extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ eo k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, eo eoVar) {
        super(activity, f6Var, false);
        this.k2 = eoVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        eo eoVar = this.k2;
        W(eoVar.R0.getY() + y3, eoVar.X0.getBackgroundSizeY());
    }
}
