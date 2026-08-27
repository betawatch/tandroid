package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v70 extends a6 {
    public final /* synthetic */ gy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(Bundle bundle, gy gyVar) {
        super(bundle);
        this.f = gyVar;
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
