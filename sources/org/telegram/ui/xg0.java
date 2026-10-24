package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ mh0 a;

    public /* synthetic */ xg0(mh0 mh0Var) {
        this.a = mh0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        mh0 mh0Var = this.a;
        if ((i10 < mh0Var.y || i10 >= mh0Var.E) && (i10 < mh0Var.H || i10 >= mh0Var.I)) {
            return false;
        }
        ((jh0) view).x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        mh0 mh0Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = mh0Var.getMessagesController().getInputPeer(-mh0Var.n);
        long j10 = mh0Var.f;
        if (j10 == mh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = mh0Var.getMessagesController().getInputUser(mh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = mh0Var.getMessagesController().getInputUser(j10);
        }
        mh0Var.c0 = true;
        mh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ug0(mh0Var, 1));
    }
}
