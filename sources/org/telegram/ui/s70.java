package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
