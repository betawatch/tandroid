package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v10 extends UndoView {
    public final /* synthetic */ e40 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = e40Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.u2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
