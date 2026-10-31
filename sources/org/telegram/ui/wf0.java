package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ kg0 a;

    public /* synthetic */ wf0(kg0 kg0Var) {
        this.a = kg0Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        kg0 kg0Var = this.a;
        if ((i10 < kg0Var.D || i10 >= kg0Var.E) && (i10 < kg0Var.H || i10 >= kg0Var.I)) {
            return false;
        }
        ((hg0) view).y.callOnClick();
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
        kg0 kg0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = kg0Var.getMessagesController().i1(-kg0Var.n);
        long j10 = kg0Var.f;
        if (j10 == kg0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kg0Var.getMessagesController().p1(kg0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = kg0Var.getMessagesController().n1(j10);
        }
        kg0Var.c0 = true;
        kg0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new sf0(kg0Var, 1));
    }
}
