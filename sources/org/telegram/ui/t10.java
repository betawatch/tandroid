package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t10 extends UndoView {
    public final /* synthetic */ c40 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = c40Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.u2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
