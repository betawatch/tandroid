package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ wn l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, wn wnVar) {
        super(activity, d6Var, false);
        this.l2 = wnVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.l2;
        W(wnVar.R0.getY() + y3, wnVar.X0.getBackgroundSizeY());
    }
}
