package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vh implements org.telegram.ui.Components.f8 {
    public final /* synthetic */ rn a;

    public vh(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.ui.Components.f8
    public final void V0(int i10, int i11) {
        rn rnVar = this.a;
        rnVar.getMessagesController().setDialogHistoryTTL(rnVar.P5, i10);
        if (rnVar.W7 == null && rnVar.V7 == null) {
            return;
        }
        rnVar.Q7();
        UndoView undoView = rnVar.u3;
        if (undoView == null) {
            return;
        }
        long j10 = rnVar.P5;
        TLRPC.User user = rnVar.f;
        TLRPC.UserFull userFull = rnVar.W7;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : rnVar.V7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.f8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a.M8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.f8
    public final /* synthetic */ void j1() {
    }
}
