package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qd extends org.telegram.ui.Components.ek0 {
    public final /* synthetic */ td d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, xd xdVar) {
        super(context, i6Var, xdVar);
        this.d0 = tdVar;
    }

    @Override // org.telegram.ui.Components.g71, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.d0.x.R0 && super.canScrollHorizontally(i7);
    }
}
