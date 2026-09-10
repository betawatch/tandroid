package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 d;

    public /* synthetic */ so(org.telegram.ui.ActionBar.p2 p2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = p2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.j61 j61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((yo) this.d, 4));
                break;
            default:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) this.d;
                b2Var.f = this.b;
                b2Var.h = this.c;
                org.telegram.ui.Components.l61 l61Var = b2Var.a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                    j61Var.N(true);
                    break;
                }
                break;
        }
    }
}
