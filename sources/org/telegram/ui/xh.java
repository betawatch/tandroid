package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xh extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ wm u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        super(activity, e6Var, false);
        this.u2 = wmVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float y9 = getY();
        wm wmVar = this.u2;
        h0(wmVar.g1.getY() + y9, wmVar.m1.getBackgroundSizeY());
    }
}
