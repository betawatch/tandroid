package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s20 extends UndoView {
    public final /* synthetic */ a50 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = a50Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.q2 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
