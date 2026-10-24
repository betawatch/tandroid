package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y70 extends d6 {
    public final /* synthetic */ ey f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f = eyVar;
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
