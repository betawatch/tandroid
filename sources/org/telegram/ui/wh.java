package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wh implements org.telegram.ui.Components.o8 {
    public final /* synthetic */ sn a;

    public wh(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.Components.o8
    public final void H0(int i10, int i11) {
        sn snVar = this.a;
        snVar.getMessagesController().setDialogHistoryTTL(snVar.f6, i10);
        if (snVar.m8 == null && snVar.l8 == null) {
            return;
        }
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView == null) {
            return;
        }
        long j10 = snVar.f6;
        TLRPC.User user = snVar.f;
        TLRPC.UserFull userFull = snVar.m8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : snVar.l8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.o8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a.c9;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.o8
    public final /* synthetic */ void Y0() {
    }
}
