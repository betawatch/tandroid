package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w10 extends UndoView {
    public final /* synthetic */ f40 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = f40Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.u2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
