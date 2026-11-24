// default package

import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x65 extends UndoView {
    public final /* synthetic */ g95 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x65(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = g95Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.t2 != null) {
            return;
        }
        super.k(j, i, obj, obj2, runnable, runnable2);
    }
}
