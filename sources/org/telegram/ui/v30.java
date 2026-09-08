package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v30 extends UndoView {
    public final /* synthetic */ j60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = j60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
