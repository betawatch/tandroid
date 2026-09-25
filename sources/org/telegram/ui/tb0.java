package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ tb0(zb0 zb0Var, int i10) {
        this.a = i10;
        this.b = zb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb0 zb0Var = this.b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
