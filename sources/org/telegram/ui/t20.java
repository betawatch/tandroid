package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t20 extends UndoView {
    public final /* synthetic */ b50 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = b50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.q2 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
