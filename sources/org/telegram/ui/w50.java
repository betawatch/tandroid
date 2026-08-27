package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ y50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(y50 y50Var, Context context) {
        super(context, true);
        this.h = y50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y50 y50Var = this.h;
        if (!y50Var.r || getParticipant() == null) {
            return;
        }
        y50Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
