package xh;

import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ b3(i3 i3Var, int i10) {
        this.a = i10;
        this.b = i3Var;
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
                i3 i3Var = this.b;
                if (!i3Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = vp.r1(i3Var.F).n1(i3Var.w);
                    tL_messages_prolongWebView.peer = vp.r1(i3Var.F).i1(i3Var.x);
                    tL_messages_prolongWebView.query_id = i3Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (i3Var.D != 0) {
                        qz.C(i3Var.F);
                        int i10 = i3Var.D;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i10;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (i3Var.E != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = vp.r1(i3Var.F).i1(i3Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (i3Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = vp.r1(i3Var.F).i1(i3Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (i3Var.x < 0 && (M0 = vp.r1(i3Var.F).M0(-i3Var.x)) != null && (peer = M0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = vp.r1(i3Var.F).l1(peer);
                        tL_messages_prolongWebView.flags |= TLObject.FLAG_13;
                    }
                    ConnectionsManager.getInstance(i3Var.F).sendRequest(tL_messages_prolongWebView, new ag.c(i3Var, 26));
                    break;
                }
                break;
            case 3:
                i3 i3Var2 = this.b;
                i3Var2.b.L1(i3Var2, 0);
                i3Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
