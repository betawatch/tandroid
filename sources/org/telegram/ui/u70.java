package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class u70 extends e6 {
    public final /* synthetic */ ey f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f = eyVar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
