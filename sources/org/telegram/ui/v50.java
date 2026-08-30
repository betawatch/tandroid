package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ w50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(w50 w50Var, Context context) {
        super(context, false);
        this.h = w50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c60 c60Var = this.h.J;
        if (c60Var.N.getVisibility() == 0 && c60Var.M2) {
            c60.N(c60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c60.N(this.h.J, this, false);
    }
}
