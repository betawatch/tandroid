package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wl extends vh.p2 {
    public final /* synthetic */ un L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(un unVar, Activity activity) {
        super(activity, 3);
        this.L0 = unVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - org.telegram.messenger.i0.L(120.0f)) + this.L0.Q1);
    }
}
