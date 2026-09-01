package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qi extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ xn h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        super(activity, g6Var, false);
        this.h2 = xnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        xn xnVar = this.h2;
        W(xnVar.O0.getY() + y10, xnVar.U0.getBackgroundSizeY());
    }
}
