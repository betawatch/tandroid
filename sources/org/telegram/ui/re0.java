package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class re0 implements org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ef0 a;

    public /* synthetic */ re0(ef0 ef0Var) {
        this.a = ef0Var;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        ef0 ef0Var = this.a;
        if ((i7 < ef0Var.D || i7 >= ef0Var.E) && (i7 < ef0Var.H || i7 >= ef0Var.I)) {
            return false;
        }
        ((bf0) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ef0 ef0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ef0Var.getMessagesController().j1(-ef0Var.n);
        long j3 = ef0Var.f;
        if (j3 == ef0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ef0Var.getMessagesController().q1(ef0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ef0Var.getMessagesController().o1(j3);
        }
        ef0Var.c0 = true;
        ef0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new oe0(ef0Var, 1));
    }
}
