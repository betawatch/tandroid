package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob b;

    public /* synthetic */ ra(ob obVar, int i10) {
        this.a = i10;
        this.b = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ob obVar = this.b;
                obVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                obVar.H0 = -1;
                obVar.e1();
                obVar.I0 = null;
                break;
            case 1:
                ob obVar2 = this.b;
                obVar2.X0(false);
                obVar2.E.l();
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
