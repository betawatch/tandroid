package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
