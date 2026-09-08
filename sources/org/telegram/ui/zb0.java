package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
