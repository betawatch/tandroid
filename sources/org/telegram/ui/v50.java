package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ x50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(x50 x50Var, Context context) {
        super(context, true);
        this.h = x50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x50 x50Var = this.h;
        if (!x50Var.r || getParticipant() == null) {
            return;
        }
        x50Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
