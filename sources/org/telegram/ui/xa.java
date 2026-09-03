package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;

    public /* synthetic */ xa(ub ubVar, int i10) {
        this.a = i10;
        this.b = ubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ub ubVar = this.b;
                ubVar.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ubVar.I0 = -1;
                ubVar.e1();
                ubVar.J0 = null;
                break;
            case 1:
                ub ubVar2 = this.b;
                ubVar2.X0(false);
                ubVar2.F.l();
                break;
            case 2:
                this.b.W0();
                break;
            default:
                this.b.U0(2);
                break;
        }
    }
}
