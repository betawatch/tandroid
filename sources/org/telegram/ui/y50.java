package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ z50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(z50 z50Var, Context context) {
        super(context, false);
        this.h = z50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f60 f60Var = this.h.M;
        if (f60Var.Q.getVisibility() == 0 && f60Var.P2) {
            f60.N(f60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f60.N(this.h.M, this, false);
    }
}
