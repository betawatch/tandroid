package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ ig0 a;

    public /* synthetic */ uf0(ig0 ig0Var) {
        this.a = ig0Var;
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        ig0 ig0Var = this.a;
        if ((i10 < ig0Var.D || i10 >= ig0Var.E) && (i10 < ig0Var.H || i10 >= ig0Var.I)) {
            return false;
        }
        ((fg0) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ig0 ig0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ig0Var.getMessagesController().i1(-ig0Var.n);
        long j10 = ig0Var.f;
        if (j10 == ig0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ig0Var.getMessagesController().p1(ig0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ig0Var.getMessagesController().n1(j10);
        }
        ig0Var.c0 = true;
        ig0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new rf0(ig0Var, 1));
    }
}
