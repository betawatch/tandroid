package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wh implements org.telegram.ui.Components.o8 {
    public final /* synthetic */ qn a;

    public wh(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.o8
    public final void H0(int i10, int i11) {
        qn qnVar = this.a;
        qnVar.getMessagesController().setDialogHistoryTTL(qnVar.T5, i10);
        if (qnVar.a8 == null && qnVar.Z7 == null) {
            return;
        }
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView == null) {
            return;
        }
        long j10 = qnVar.T5;
        TLRPC.User user = qnVar.f;
        TLRPC.UserFull userFull = qnVar.a8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : qnVar.Z7.ttl_period), null, null);
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
