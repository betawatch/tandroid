package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
