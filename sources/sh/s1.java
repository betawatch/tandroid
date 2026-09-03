package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements ov0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.ov0
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
                ((wh.z1) this.b).getClass();
                break;
        }
    }
}
