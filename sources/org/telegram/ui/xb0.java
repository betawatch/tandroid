package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc0 b;

    public /* synthetic */ xb0(dc0 dc0Var, int i10) {
        this.a = i10;
        this.b = dc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dc0 dc0Var = this.b;
                if (dc0Var.h >= 0) {
                    ConnectionsManager.getInstance(dc0Var.b).cancelRequest(dc0Var.h, true);
                    dc0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
