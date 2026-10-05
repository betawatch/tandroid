package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class v30 extends UndoView {
    public final /* synthetic */ h60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = h60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
