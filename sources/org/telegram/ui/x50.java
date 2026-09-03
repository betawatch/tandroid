package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ y50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(y50 y50Var, Context context) {
        super(context, false);
        this.h = y50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e60 e60Var = this.h.J;
        if (e60Var.N.getVisibility() == 0 && e60Var.M2) {
            e60.N(e60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e60.N(this.h.J, this, false);
    }
}
