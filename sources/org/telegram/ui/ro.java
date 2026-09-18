package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;

    public /* synthetic */ ro(org.telegram.ui.ActionBar.o2 o2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = o2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.x51 x51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((wo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.h = this.b;
                z1Var.n = this.c;
                org.telegram.ui.Components.z51 z51Var = z1Var.a;
                if (z51Var != null && (x51Var = z51Var.Y2) != null && z51Var.G) {
                    x51Var.N(true);
                    break;
                }
                break;
        }
    }
}
