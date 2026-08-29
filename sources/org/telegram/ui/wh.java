package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wh implements org.telegram.ui.Components.l8 {
    public final /* synthetic */ tn a;

    public wh(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.Components.l8
    public final void T0(int i10, int i11) {
        tn tnVar = this.a;
        tnVar.getMessagesController().setDialogHistoryTTL(tnVar.P5, i10);
        if (tnVar.W7 == null && tnVar.V7 == null) {
            return;
        }
        tnVar.Q7();
        UndoView undoView = tnVar.u3;
        if (undoView == null) {
            return;
        }
        long j10 = tnVar.P5;
        TLRPC.User user = tnVar.f;
        TLRPC.UserFull userFull = tnVar.W7;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : tnVar.V7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.l8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a.M8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final /* synthetic */ void e1() {
    }
}
