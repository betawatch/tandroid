package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v10 extends s4 {
    public final /* synthetic */ x30 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = x30Var;
    }

    @Override // org.telegram.ui.s4, org.telegram.ui.Components.rf0
    public final void c() {
        x30 x30Var = this.V;
        org.telegram.messenger.c cVar = x30Var.l1;
        w10 w10Var = x30Var.j1;
        long dialogId = w10Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(cVar.a).a2(Long.valueOf(dialogId));
            w10Var.H(null, org.telegram.messenger.ac.m(cVar.a, 0, a22), org.telegram.messenger.ac.m(cVar.a, 1, a22), false);
        }
    }
}
