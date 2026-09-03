package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        d60 d60Var = this.h.J;
        if (d60Var.N.getVisibility() == 0 && d60Var.M2) {
            d60.N(d60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d60.N(this.h.J, this, false);
    }
}
