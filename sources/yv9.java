// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yv9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw9 b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ yv9(dw9 dw9Var, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                dw9Var.getMessagesController().Z3(tL_encryptedChatDiscarded, false);
                dw9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                break;
            default:
                dw9Var.getMessagesController().Z3(tL_encryptedChatDiscarded, false);
                dw9Var.getMessagesStorage().S1(tL_encryptedChatDiscarded);
                dw9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                break;
        }
    }
}
