package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 d;

    public /* synthetic */ ro(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = n2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.w51 w51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((wo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f = this.b;
                z1Var.h = this.c;
                org.telegram.ui.Components.y51 y51Var = z1Var.a;
                if (y51Var != null && (w51Var = y51Var.Y2) != null && y51Var.G) {
                    w51Var.N(true);
                    break;
                }
                break;
        }
    }
}
