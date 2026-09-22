package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.Components.jo {
    public final /* synthetic */ bo M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(bo boVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i10, document, e6Var);
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
