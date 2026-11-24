// default package

import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z45 extends UndoView {
    public final /* synthetic */ h75 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z45(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = h75Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        if (this.k0.t2 != null) {
            return;
        }
        super.k(j, i, obj, obj2, runnable, runnable2);
    }
}
