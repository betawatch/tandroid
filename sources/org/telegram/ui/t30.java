package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t30 extends UndoView {
    public final /* synthetic */ g60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = g60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
