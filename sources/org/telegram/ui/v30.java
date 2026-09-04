package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class v30 extends UndoView {
    public final /* synthetic */ j60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f0 = j60Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.f0.z0 != null) {
            return;
        }
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
