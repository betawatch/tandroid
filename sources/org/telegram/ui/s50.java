package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ u50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(u50 u50Var, Context context) {
        super(context, true);
        this.h = u50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u50 u50Var = this.h;
        if (!u50Var.r || getParticipant() == null) {
            return;
        }
        u50Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
