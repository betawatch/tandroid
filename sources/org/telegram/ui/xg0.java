package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ lh0 a;

    public /* synthetic */ xg0(lh0 lh0Var) {
        this.a = lh0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        lh0 lh0Var = this.a;
        if ((i10 < lh0Var.y || i10 >= lh0Var.E) && (i10 < lh0Var.H || i10 >= lh0Var.I)) {
            return false;
        }
        ((ih0) view).x.callOnClick();
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
        lh0 lh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = lh0Var.getMessagesController().getInputPeer(-lh0Var.n);
        long j10 = lh0Var.f;
        if (j10 == lh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = lh0Var.getMessagesController().getInputUser(lh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = lh0Var.getMessagesController().getInputUser(j10);
        }
        lh0Var.c0 = true;
        lh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ug0(lh0Var, 1));
    }
}
