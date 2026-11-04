package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u50 extends z5 {
    public final /* synthetic */ uw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(Bundle bundle, uw uwVar) {
        super(bundle);
        this.f = uwVar;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
