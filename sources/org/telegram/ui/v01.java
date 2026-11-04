package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v01 extends org.telegram.ui.Components.xu0 {
    public final /* synthetic */ yz0 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v01(yz0 yz0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.H3 = yz0Var;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean D1() {
        return org.telegram.messenger.lc.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void H1(int i3) {
        super.H1(i3);
        this.H3.d(false);
    }
}
