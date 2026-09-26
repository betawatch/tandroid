package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
