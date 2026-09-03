package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ zn h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(activity, f6Var, false);
        this.h2 = znVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        zn znVar = this.h2;
        W(znVar.O0.getY() + y10, znVar.U0.getBackgroundSizeY());
    }
}
