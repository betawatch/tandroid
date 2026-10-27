package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
