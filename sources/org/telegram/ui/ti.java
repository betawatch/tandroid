package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ti extends org.telegram.ui.Components.jo {
    public final /* synthetic */ bo M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(bo boVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.M = boVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        bo boVar = this.M;
        float y10 = boVar.R0.getY() + y3;
        this.J = boVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
