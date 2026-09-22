package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v30 extends UndoView {
    public final /* synthetic */ i60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = i60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
