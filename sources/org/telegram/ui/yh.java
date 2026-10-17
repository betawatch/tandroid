package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yh implements org.telegram.ui.Components.o8 {
    public final /* synthetic */ sn a;

    public yh(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.Components.o8
    public final void H0(int i10, int i11) {
        sn snVar = this.a;
        snVar.getMessagesController().setDialogHistoryTTL(snVar.T5, i10);
        if (snVar.a8 == null && snVar.Z7 == null) {
            return;
        }
        snVar.T7();
        UndoView undoView = snVar.y3;
        if (undoView == null) {
            return;
        }
        long j10 = snVar.T5;
        TLRPC.User user = snVar.f;
        TLRPC.UserFull userFull = snVar.a8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : snVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.o8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.o8
    public final /* synthetic */ void Y0() {
    }
}
