package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ kh0 a;

    public /* synthetic */ vg0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        kh0 kh0Var = this.a;
        if ((i10 < kh0Var.y || i10 >= kh0Var.E) && (i10 < kh0Var.H || i10 >= kh0Var.I)) {
            return false;
        }
        ((hh0) view).x.callOnClick();
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
        kh0 kh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.n);
        long j10 = kh0Var.f;
        if (j10 == kh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(kh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(j10);
        }
        kh0Var.c0 = true;
        kh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sg0(kh0Var, 1));
    }
}
