package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.Components.mo {
    public final /* synthetic */ yn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(yn ynVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, i10, document, d6Var);
        this.M = ynVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        yn ynVar = this.M;
        float y10 = ynVar.P0.getY() + y3;
        this.J = ynVar.V0.getBackgroundSizeY();
        this.I = y10;
    }
}
