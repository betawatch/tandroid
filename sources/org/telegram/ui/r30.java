package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r30 extends UndoView {
    public final /* synthetic */ d60 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.c0 = d60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.c0.w0 != null) {
            return;
        }
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
