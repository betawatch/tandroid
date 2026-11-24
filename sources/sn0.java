// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sn0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ sn0(wsa wsaVar, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    LaunchActivity.Q().showAsSheet(new lp0(-chat.id), bh0Var);
                    break;
                }
                break;
            default:
                wsa.g2(xza.e0(chat, true));
                break;
        }
    }

    public /* synthetic */ sn0(TLRPC.Chat chat) {
        this.b = chat;
    }
}
