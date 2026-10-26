package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xh implements org.telegram.ui.Components.q8 {
    public final /* synthetic */ un a;

    public xh(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.q8
    public final void T0(int i10, int i11) {
        un unVar = this.a;
        unVar.getMessagesController().setDialogHistoryTTL(unVar.f6, i10);
        if (unVar.m8 == null && unVar.l8 == null) {
            return;
        }
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView == null) {
            return;
        }
        long j10 = unVar.f6;
        TLRPC.User user = unVar.f;
        TLRPC.UserFull userFull = unVar.m8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : unVar.l8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.q8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a.c9;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.q8
    public final /* synthetic */ void e1() {
    }
}
