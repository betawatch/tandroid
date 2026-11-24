// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wv9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw9 b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ wv9(dw9 dw9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                dw9Var.getNotificationCenter().k(36, encryptedChat);
                break;
            case 1:
                dw9Var.getNotificationCenter().k(36, encryptedChat);
                dw9Var.w(encryptedChat, null);
                break;
            default:
                dw9Var.getNotificationCenter().k(36, encryptedChat);
                dw9Var.w(encryptedChat, null);
                break;
        }
    }
}
