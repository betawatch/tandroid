package org.telegram.ui.web;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y4;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ b0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i9) {
        this.a = i9;
        this.c = notificationCenterDelegate;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.c;
                c0Var.getClass();
                c0Var.presentFragment(qn.R9(this.b));
                break;
            case 1:
                qh.p pVar = (qh.p) this.c;
                y4.M(pVar.b.b0.getParentActivity(), this.b, new n5.a0(pVar, 13), pVar.a);
                break;
            default:
                qh.x1 x1Var = (qh.x1) this.c;
                y4.M(x1Var.getParentActivity(), this.b, new m5.c0(x1Var, 21), x1Var.getResourceProvider());
                break;
        }
    }
}
