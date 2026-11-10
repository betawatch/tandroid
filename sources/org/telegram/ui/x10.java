package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x10 extends UndoView {
    public final /* synthetic */ f40 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = f40Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.j0.t2 != null) {
            return;
        }
        super.k(j3, i7, obj, obj2, runnable, runnable2);
    }
}
