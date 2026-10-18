package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ jh0 a;

    public /* synthetic */ ug0(jh0 jh0Var) {
        this.a = jh0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        jh0 jh0Var = this.a;
        if ((i10 < jh0Var.y || i10 >= jh0Var.E) && (i10 < jh0Var.H || i10 >= jh0Var.I)) {
            return false;
        }
        ((gh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        jh0 jh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = jh0Var.getMessagesController().getInputPeer(-jh0Var.n);
        long j10 = jh0Var.f;
        if (j10 == jh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(jh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = jh0Var.getMessagesController().getInputUser(j10);
        }
        jh0Var.c0 = true;
        jh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new rg0(jh0Var, 1));
    }
}
