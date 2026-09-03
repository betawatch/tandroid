package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qi extends org.telegram.ui.Components.eo {
    public final /* synthetic */ zn J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(zn znVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.J = znVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        zn znVar = this.J;
        float y11 = znVar.O0.getY() + y10;
        this.G = znVar.U0.getBackgroundSizeY();
        this.F = y11;
    }
}
