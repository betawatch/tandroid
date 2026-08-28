package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ sa(pb pbVar, int i9) {
        this.a = i9;
        this.b = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pb pbVar = this.b;
                pbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                pbVar.H0 = -1;
                pbVar.e1();
                pbVar.I0 = null;
                break;
            case 1:
                pb pbVar2 = this.b;
                pbVar2.X0(false);
                pbVar2.E.l();
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
