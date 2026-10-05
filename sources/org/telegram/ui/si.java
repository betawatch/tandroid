package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ yn l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, yn ynVar) {
        super(activity, d6Var, false);
        this.l2 = ynVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        yn ynVar = this.l2;
        U(ynVar.P0.getY() + y3, ynVar.V0.getBackgroundSizeY());
    }
}
