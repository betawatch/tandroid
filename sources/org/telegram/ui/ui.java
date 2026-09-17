package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ co k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, co coVar) {
        super(activity, f6Var, false);
        this.k2 = coVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        co coVar = this.k2;
        W(coVar.R0.getY() + y3, coVar.X0.getBackgroundSizeY());
    }
}
