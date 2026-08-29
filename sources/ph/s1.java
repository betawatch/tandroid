package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements gv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.gv0
    public final void G(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                g2 g2Var = ((p2) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((th.x1) this.b).getClass();
                break;
        }
    }
}
