package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
