package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb b;

    public /* synthetic */ ta(qb qbVar, int i10) {
        this.a = i10;
        this.b = qbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb qbVar = this.b;
                qbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                qbVar.H0 = -1;
                qbVar.e1();
                qbVar.I0 = null;
                break;
            case 1:
                qb qbVar2 = this.b;
                qbVar2.X0(false);
                qbVar2.E.l();
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
