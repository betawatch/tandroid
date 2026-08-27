package org.telegram.ui.web;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y4;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ c0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.c;
                d0Var.getClass();
                d0Var.presentFragment(rn.R9(this.b));
                break;
            case 1:
                rh.p pVar = (rh.p) this.c;
                y4.M(pVar.b.b0.getParentActivity(), this.b, new o0.b(pVar, 16), pVar.a);
                break;
            default:
                rh.x1 x1Var = (rh.x1) this.c;
                y4.M(x1Var.getParentActivity(), this.b, new n1.d(x1Var, 18), x1Var.getResourceProvider());
                break;
        }
    }
}
