package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ jh0 a;

    public /* synthetic */ vg0(jh0 jh0Var) {
        this.a = jh0Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
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

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
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
        jh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sg0(jh0Var, 1));
    }
}
