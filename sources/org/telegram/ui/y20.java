package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y20 extends q4 {
    public final /* synthetic */ a50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = a50Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.rg0
    public final void c() {
        a50 a50Var = this.U;
        org.telegram.messenger.c cVar = a50Var.k1;
        z20 z20Var = a50Var.i1;
        long dialogId = z20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(cVar.a).Z1(Long.valueOf(dialogId));
            z20Var.H(null, org.telegram.messenger.jc.m(cVar.a, 0, Z1), org.telegram.messenger.jc.m(cVar.a, 1, Z1), false);
        }
    }
}
