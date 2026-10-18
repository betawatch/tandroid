package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class u70 extends e6 {
    public final /* synthetic */ ey f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(Bundle bundle, ey eyVar) {
        super(bundle);
        this.f = eyVar;
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
