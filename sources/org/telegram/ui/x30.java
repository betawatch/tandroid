package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x30 extends UndoView {
    public final /* synthetic */ k60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = k60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
