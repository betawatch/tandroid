package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ b60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(b60 b60Var, Context context) {
        super(context, true);
        this.h = b60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b60 b60Var = this.h;
        if (!b60Var.r || getParticipant() == null) {
            return;
        }
        b60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
