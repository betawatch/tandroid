package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
