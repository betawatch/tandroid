package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ ya(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vb vbVar = this.b;
                vbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                break;
            case 1:
                vb vbVar2 = this.b;
                vbVar2.W0(false);
                vbVar2.E.l();
                break;
            default:
                this.b.V0();
                break;
        }
    }
}
