package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
