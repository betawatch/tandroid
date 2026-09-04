package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 d;

    public /* synthetic */ so(org.telegram.ui.ActionBar.n2 n2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = n2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.v51 v51Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((xo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.d;
                a2Var.f = this.b;
                a2Var.h = this.c;
                org.telegram.ui.Components.x51 x51Var = a2Var.a;
                if (x51Var != null && (v51Var = x51Var.Y2) != null && x51Var.G) {
                    v51Var.N(true);
                    break;
                }
                break;
        }
    }
}
