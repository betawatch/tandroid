package rh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ g3(o3 o3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.L();
                break;
            case 1:
                this.b.K();
                break;
            case 2:
                o3 o3Var = this.b;
                if (!o3Var.Q) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(o3Var.C).getInputUser(o3Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(o3Var.C).getInputPeer(o3Var.w);
                    tL_messages_prolongWebView.query_id = o3Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (o3Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(o3Var.C).createReplyInput(o3Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (o3Var.B != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(o3Var.C).getInputPeer(o3Var.B);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (o3Var.B != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(o3Var.C).getInputPeer(o3Var.B);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (o3Var.w < 0 && (chatFull = MessagesController.getInstance(o3Var.C).getChatFull(-o3Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(o3Var.C).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(o3Var.C).sendRequest(tL_messages_prolongWebView, new gf.a(o3Var, 19));
                    break;
                }
                break;
            case 3:
                o3 o3Var2 = this.b;
                o3Var2.b.X1(o3Var2, 0);
                o3Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
