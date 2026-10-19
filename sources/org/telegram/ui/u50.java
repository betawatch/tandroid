package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class u50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ w50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(w50 w50Var, Context context) {
        super(context, true);
        this.h = w50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w50 w50Var = this.h;
        if (!w50Var.r || getParticipant() == null) {
            return;
        }
        w50Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
