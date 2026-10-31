package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wi extends org.telegram.ui.Cells.s0 {
    public final /* synthetic */ un t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, un unVar) {
        super(activity, p6Var, false);
        this.t2 = unVar;
    }

    @Override // org.telegram.ui.Cells.s0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.t2;
        g0(unVar.f1.getY() + y3, unVar.l1.getBackgroundSizeY());
    }
}
