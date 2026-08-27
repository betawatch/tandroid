package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg0 implements org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ kh0 a;

    public /* synthetic */ wg0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        kh0 kh0Var = this.a;
        if ((i10 < kh0Var.y || i10 >= kh0Var.A) && (i10 < kh0Var.D || i10 >= kh0Var.E)) {
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        kh0 kh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.n);
        long j10 = kh0Var.f;
        if (j10 == kh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(kh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kh0Var.getMessagesController().getInputUser(j10);
        }
        kh0Var.Y = true;
        kh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new tg0(kh0Var, 1));
    }
}
