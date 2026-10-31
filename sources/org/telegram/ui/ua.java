package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                sbVar.h1();
                sbVar.I0 = null;
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.a1(false);
                sbVar2.E.f();
                break;
            default:
                this.b.Z0();
                break;
        }
    }
}
