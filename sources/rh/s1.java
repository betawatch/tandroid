package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        switch (this.a) {
            case 0:
                g2 g2Var = ((p2) this.b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((vh.y1) this.b).getClass();
                break;
        }
    }
}
