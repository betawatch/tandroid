package xh;

import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ b3(j3 j3Var, int i10) {
        this.a = i10;
        this.b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull M0;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.Q();
                break;
            case 1:
                this.b.O();
                break;
            case 2:
                j3 j3Var = this.b;
                if (!j3Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = wp.r1(j3Var.F).n1(j3Var.w);
                    tL_messages_prolongWebView.peer = wp.r1(j3Var.F).i1(j3Var.x);
                    tL_messages_prolongWebView.query_id = j3Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (j3Var.D != 0) {
                        rz.C(j3Var.F);
                        int i10 = j3Var.D;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i10;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (j3Var.E != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = wp.r1(j3Var.F).i1(j3Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (j3Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = wp.r1(j3Var.F).i1(j3Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (j3Var.x < 0 && (M0 = wp.r1(j3Var.F).M0(-j3Var.x)) != null && (peer = M0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = wp.r1(j3Var.F).l1(peer);
                        tL_messages_prolongWebView.flags |= TLObject.FLAG_13;
                    }
                    ConnectionsManager.getInstance(j3Var.F).sendRequest(tL_messages_prolongWebView, new ag.c(j3Var, 26));
                    break;
                }
                break;
            case 3:
                j3 j3Var2 = this.b;
                j3Var2.b.L1(j3Var2, 0);
                j3Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
