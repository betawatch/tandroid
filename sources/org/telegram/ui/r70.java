package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r70 extends z5 {
    public final /* synthetic */ dy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(Bundle bundle, dy dyVar) {
        super(bundle);
        this.f = dyVar;
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
