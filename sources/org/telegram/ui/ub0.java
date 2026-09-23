package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac0 b;

    public /* synthetic */ ub0(ac0 ac0Var, int i10) {
        this.a = i10;
        this.b = ac0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ac0 ac0Var = this.b;
                if (ac0Var.h >= 0) {
                    ConnectionsManager.getInstance(ac0Var.b).cancelRequest(ac0Var.h, true);
                    ac0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
