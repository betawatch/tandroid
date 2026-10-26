package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                wbVar.e1();
                wbVar.I0 = null;
                break;
            case 1:
                wb wbVar2 = this.b;
                wbVar2.X0(false);
                wbVar2.E.l();
                break;
            default:
                this.b.W0();
                break;
        }
    }
}
