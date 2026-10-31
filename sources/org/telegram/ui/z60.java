package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z60 extends x5 {
    public final /* synthetic */ ay f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(Bundle bundle, ay ayVar) {
        super(bundle);
        this.f = ayVar;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
