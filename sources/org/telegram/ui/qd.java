package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qd extends org.telegram.ui.Components.vj0 {
    public final /* synthetic */ td d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, xd xdVar) {
        super(context, e6Var, xdVar);
        this.d0 = tdVar;
    }

    @Override // org.telegram.ui.Components.n61, android.view.View
    public final boolean canScrollHorizontally(int i3) {
        return this.d0.x.R0 && super.canScrollHorizontally(i3);
    }
}
