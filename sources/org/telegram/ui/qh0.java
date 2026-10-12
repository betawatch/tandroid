package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ ei0 a;

    public /* synthetic */ qh0(ei0 ei0Var) {
        this.a = ei0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        ei0 ei0Var = this.a;
        if ((i10 < ei0Var.y || i10 >= ei0Var.E) && (i10 < ei0Var.H || i10 >= ei0Var.I)) {
            return false;
        }
        ((bi0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ei0 ei0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ei0Var.getMessagesController().getInputPeer(-ei0Var.n);
        long j10 = ei0Var.f;
        if (j10 == ei0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ei0Var.getMessagesController().getInputUser(ei0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ei0Var.getMessagesController().getInputUser(j10);
        }
        ei0Var.c0 = true;
        ei0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new nh0(ei0Var, 1));
    }
}
