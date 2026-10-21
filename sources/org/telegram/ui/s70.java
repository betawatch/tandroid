package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class s70 extends e6 {
    public final /* synthetic */ cy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(Bundle bundle, cy cyVar) {
        super(bundle);
        this.f = cyVar;
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
