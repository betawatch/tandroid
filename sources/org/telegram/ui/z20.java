package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z20 extends q4 {
    public final /* synthetic */ b50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = b50Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.qg0
    public final void c() {
        b50 b50Var = this.U;
        org.telegram.messenger.c cVar = b50Var.k1;
        a30 a30Var = b50Var.i1;
        long dialogId = a30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(cVar.a).Z1(Long.valueOf(dialogId));
            a30Var.H(null, org.telegram.messenger.ic.m(cVar.a, 0, Z1), org.telegram.messenger.ic.m(cVar.a, 1, Z1), false);
        }
    }
}
