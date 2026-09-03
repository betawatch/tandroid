package vh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tp0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = (q) this.c;
                org.telegram.ui.Components.z4.M(qVar.b.c0.getParentActivity(), this.b, new tp0(qVar, 20), qVar.a);
                break;
            default:
                y1 y1Var = (y1) this.c;
                org.telegram.ui.Components.z4.M(y1Var.getParentActivity(), this.b, new o3.c(y1Var, 26), y1Var.getResourceProvider());
                break;
        }
    }
}
