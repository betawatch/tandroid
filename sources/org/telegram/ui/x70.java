package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x70 extends c6 {
    public final /* synthetic */ cy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(Bundle bundle, cy cyVar) {
        super(bundle);
        this.f = cyVar;
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
