package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z10 extends q4 {
    public final /* synthetic */ c40 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = c40Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.rf0
    public final void c() {
        c40 c40Var = this.V;
        org.telegram.messenger.c cVar = c40Var.o1;
        a20 a20Var = c40Var.m1;
        long dialogId = a20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(cVar.a).a2(Long.valueOf(dialogId));
            a20Var.H(null, org.telegram.messenger.gc.m(cVar.a, 0, a22), org.telegram.messenger.gc.m(cVar.a, 1, a22), false);
        }
    }
}
