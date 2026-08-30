package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        switch (this.a) {
            case 0:
                h2 h2Var = ((q2) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    h2Var.e(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((vh.y1) this.b).getClass();
                break;
        }
    }
}
