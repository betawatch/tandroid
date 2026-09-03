package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s30 extends UndoView {
    public final /* synthetic */ e60 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.c0 = e60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.c0.w0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
