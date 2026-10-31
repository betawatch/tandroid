package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x21 extends org.telegram.ui.Components.bw0 {
    public final /* synthetic */ a21 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(a21 a21Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.G3 = a21Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean D1() {
        return org.telegram.messenger.sc.e(16388) || this.G3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void H1(int i10) {
        super.H1(i10);
        this.G3.d(false);
    }
}
