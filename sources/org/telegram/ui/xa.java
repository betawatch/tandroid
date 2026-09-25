package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ubVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ubVar.H0 = -1;
                ubVar.d1();
                ubVar.I0 = null;
                break;
            case 1:
                ub ubVar2 = this.b;
                ubVar2.W0(false);
                ubVar2.E.l();
                break;
            default:
                this.b.V0();
                break;
        }
    }
}
