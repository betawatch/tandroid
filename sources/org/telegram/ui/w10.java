package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w10 extends UndoView {
    public final /* synthetic */ e40 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = e40Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.q2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
