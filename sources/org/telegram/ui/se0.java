package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ff0 a;

    public /* synthetic */ se0(ff0 ff0Var) {
        this.a = ff0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        ff0 ff0Var = this.a;
        if ((i7 < ff0Var.E || i7 >= ff0Var.F) && (i7 < ff0Var.I || i7 >= ff0Var.J)) {
            return false;
        }
        ((cf0) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ff0 ff0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ff0Var.getMessagesController().l1(-ff0Var.n);
        long j3 = ff0Var.f;
        if (j3 == ff0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ff0Var.getMessagesController().s1(ff0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ff0Var.getMessagesController().q1(j3);
        }
        ff0Var.d0 = true;
        ff0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new pe0(ff0Var, 1));
    }
}
