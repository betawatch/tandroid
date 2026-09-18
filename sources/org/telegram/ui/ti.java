package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ti extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ zn l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, zn znVar) {
        super(activity, e6Var, false);
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
