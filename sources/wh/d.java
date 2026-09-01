package wh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                org.telegram.ui.Components.z4.M(qVar.b.c0.getParentActivity(), this.b, new oh.h4(qVar, 25), qVar.a);
                break;
            default:
                z1 z1Var = (z1) this.c;
                org.telegram.ui.Components.z4.M(z1Var.getParentActivity(), this.b, new org.telegram.ui.web.e0(z1Var, 20), z1Var.getResourceProvider());
                break;
        }
    }
}
