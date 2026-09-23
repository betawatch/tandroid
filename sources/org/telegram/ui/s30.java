package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s30 extends UndoView {
    public final /* synthetic */ f60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = f60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
