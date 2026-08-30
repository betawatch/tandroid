package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ va(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                sbVar.I0 = -1;
                sbVar.e1();
                sbVar.J0 = null;
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.X0(false);
                sbVar2.F.l();
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
