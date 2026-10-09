package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ a60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a60 a60Var, Context context) {
        super(context, false);
        this.h = a60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g60 g60Var = this.h.M;
        if (g60Var.Q.getVisibility() == 0 && g60Var.P2) {
            g60.O(g60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g60.O(this.h.M, this, false);
    }
}
