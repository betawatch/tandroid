package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg0 implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ hh0 a;

    public /* synthetic */ tg0(hh0 hh0Var) {
        this.a = hh0Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        hh0 hh0Var = this.a;
        if ((i9 < hh0Var.y || i9 >= hh0Var.A) && (i9 < hh0Var.D || i9 >= hh0Var.E)) {
            return false;
        }
        ((eh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        hh0 hh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.n);
        long j10 = hh0Var.f;
        if (j10 == hh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(hh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = hh0Var.getMessagesController().getInputUser(j10);
        }
        hh0Var.Y = true;
        hh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new qg0(hh0Var, 1));
    }
}
