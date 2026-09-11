package org.telegram.ui;

import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
