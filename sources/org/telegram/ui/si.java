package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
