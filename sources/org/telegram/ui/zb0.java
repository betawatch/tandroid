package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc0 b;

    public /* synthetic */ zb0(fc0 fc0Var, int i10) {
        this.a = i10;
        this.b = fc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fc0 fc0Var = this.b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
