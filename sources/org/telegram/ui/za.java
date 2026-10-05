package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ za(wb wbVar, int i10) {
        this.a = i10;
        this.b = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wb wbVar = this.b;
                wbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                wbVar.H0 = -1;
                wbVar.d1();
                wbVar.I0 = null;
                break;
            case 1:
                wb wbVar2 = this.b;
                wbVar2.W0(false);
                wbVar2.E.l();
                break;
            default:
                this.b.V0();
                break;
        }
    }
}
