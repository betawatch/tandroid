package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class th implements org.telegram.ui.Components.g8 {
    public final /* synthetic */ qn a;

    public th(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.g8
    public final void V0(int i9, int i10) {
        qn qnVar = this.a;
        qnVar.getMessagesController().setDialogHistoryTTL(qnVar.P5, i9);
        if (qnVar.W7 == null && qnVar.V7 == null) {
            return;
        }
        qnVar.Q7();
        UndoView undoView = qnVar.u3;
        if (undoView == null) {
            return;
        }
        long j10 = qnVar.P5;
        TLRPC.User user = qnVar.f;
        TLRPC.UserFull userFull = qnVar.W7;
        undoView.k(j10, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : qnVar.V7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.g8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a.M8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final /* synthetic */ void h1() {
    }
}
