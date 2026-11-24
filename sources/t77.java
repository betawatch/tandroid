// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class t77 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ t77(oc7 oc7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.d = j2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        switch (b) {
            case 0:
                oc7 oc7Var = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.Q3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, j2);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            default:
                oc7 oc7Var2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        oc7Var2.O3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, oc7Var2.F4, false, false, false);
                    }
                }
                if (j2 != 0) {
                    oc7Var2.getMessagesStorage().n1(j2);
                }
                oc7Var2.T0.e(j);
                break;
        }
    }
}
