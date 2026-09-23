package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qi extends org.telegram.ui.Components.ko {
    public final /* synthetic */ xn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(xn xnVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, i10, document, d6Var);
        this.M = xnVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        xn xnVar = this.M;
        float y10 = xnVar.R0.getY() + y3;
        this.J = xnVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
