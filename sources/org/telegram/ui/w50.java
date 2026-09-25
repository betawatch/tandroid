package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ x50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(x50 x50Var, Context context) {
        super(context, false);
        this.h = x50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d60 d60Var = this.h.M;
        if (d60Var.Q.getVisibility() == 0 && d60Var.P2) {
            d60.N(d60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d60.N(this.h.M, this, false);
    }
}
