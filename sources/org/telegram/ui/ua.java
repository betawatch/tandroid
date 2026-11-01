package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ua(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                sbVar.H0 = -1;
                sbVar.i1();
                sbVar.I0 = null;
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.b1(false);
                sbVar2.E.f();
                break;
            default:
                this.b.a1();
                break;
        }
    }
}
