package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u10 extends UndoView {
    public final /* synthetic */ c40 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = c40Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.q2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
