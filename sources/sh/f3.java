package sh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ f3(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
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
                n3 n3Var = this.b;
                if (!n3Var.Q) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(n3Var.C).getInputUser(n3Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(n3Var.C).getInputPeer(n3Var.w);
                    tL_messages_prolongWebView.query_id = n3Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (n3Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(n3Var.C).createReplyInput(n3Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (n3Var.B != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(n3Var.C).getInputPeer(n3Var.B);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (n3Var.B != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(n3Var.C).getInputPeer(n3Var.B);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (n3Var.w < 0 && (chatFull = MessagesController.getInstance(n3Var.C).getChatFull(-n3Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(n3Var.C).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(n3Var.C).sendRequest(tL_messages_prolongWebView, new gf.a(n3Var, 19));
                    break;
                }
                break;
            case 3:
                n3 n3Var2 = this.b;
                n3Var2.b.X1(n3Var2, 0);
                n3Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
