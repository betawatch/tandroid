package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
