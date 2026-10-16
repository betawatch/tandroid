package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ fo t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        super(activity, c6Var, false);
        this.t2 = foVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        fo foVar = this.t2;
        a0(foVar.R0.getY() + y3, foVar.X0.getBackgroundSizeY());
    }
}
