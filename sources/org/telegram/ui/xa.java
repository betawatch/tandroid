package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                ubVar.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ubVar.L0 = -1;
                ubVar.e1();
                ubVar.M0 = null;
                break;
            case 1:
                ub ubVar2 = this.b;
                ubVar2.X0(false);
                ubVar2.I.l();
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
