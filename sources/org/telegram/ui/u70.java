package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u70 extends a6 {
    public final /* synthetic */ fy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(Bundle bundle, fy fyVar) {
        super(bundle);
        this.f = fyVar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
