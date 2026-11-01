package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z60 extends x5 {
    public final /* synthetic */ zx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(Bundle bundle, zx zxVar) {
        super(bundle);
        this.f = zxVar;
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
