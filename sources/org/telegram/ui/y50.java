package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class y50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ a60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(a60 a60Var, Context context) {
        super(context, true);
        this.h = a60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a60 a60Var = this.h;
        if (!a60Var.r || getParticipant() == null) {
            return;
        }
        a60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
