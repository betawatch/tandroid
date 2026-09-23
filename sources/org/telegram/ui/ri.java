package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ xn l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, xn xnVar) {
        super(activity, d6Var, false);
        this.l2 = xnVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        xn xnVar = this.l2;
        W(xnVar.R0.getY() + y3, xnVar.X0.getBackgroundSizeY());
    }
}
