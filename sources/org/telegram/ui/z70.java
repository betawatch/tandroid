package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z70 extends c6 {
    public final /* synthetic */ ey f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f = eyVar;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
