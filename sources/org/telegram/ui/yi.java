package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.Cells.x0 {
    public final /* synthetic */ fo t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        super(activity, c6Var, false);
        this.t2 = foVar;
    }

    @Override // org.telegram.ui.Cells.x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        fo foVar = this.t2;
        a0(foVar.R0.getY() + y3, foVar.X0.getBackgroundSizeY());
    }
}
