package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ rb0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                if (yb0Var.h >= 0) {
                    ConnectionsManager.getInstance(yb0Var.b).cancelRequest(yb0Var.h, true);
                    yb0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
