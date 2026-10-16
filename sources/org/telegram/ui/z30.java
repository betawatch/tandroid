package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z30 extends UndoView {
    public final /* synthetic */ n60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = n60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
