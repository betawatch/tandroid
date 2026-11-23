package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
