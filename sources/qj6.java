// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qj6 implements t69, fd {
    public final /* synthetic */ ck6 a;

    public /* synthetic */ qj6(ck6 ck6Var) {
        this.a = ck6Var;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        ck6 ck6Var = this.a;
        if ((i < ck6Var.E || i >= ck6Var.F) && (i < ck6Var.I || i >= ck6Var.J)) {
            return false;
        }
        ((zj6) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ck6 ck6Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ck6Var.getMessagesController().j1(-ck6Var.n);
        long j = ck6Var.f;
        if (j == ck6Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ck6Var.getMessagesController().q1(ck6Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ck6Var.getMessagesController().o1(j);
        }
        ck6Var.d0 = true;
        ck6Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new nj6(ck6Var, (byte) 0));
    }
}
