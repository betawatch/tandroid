package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v21 extends org.telegram.ui.Components.cw0 {
    public final /* synthetic */ y11 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(y11 y11Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.G3 = y11Var;
    }

    @Override // org.telegram.ui.Components.cw0
    public final boolean D1() {
        return org.telegram.messenger.tc.e(16388) || this.G3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.cw0
    public final void H1(int i10) {
        super.H1(i10);
        this.G3.d(false);
    }
}
