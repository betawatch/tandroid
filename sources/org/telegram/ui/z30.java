package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
