package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ zn l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(activity, f6Var, false);
        this.l2 = znVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        zn znVar = this.l2;
        W(znVar.R0.getY() + y3, znVar.X0.getBackgroundSizeY());
    }
}
