package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z50 extends y5 {
    public final /* synthetic */ yw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(Bundle bundle, yw ywVar) {
        super(bundle);
        this.f = ywVar;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
