// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class px9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx9 b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ px9(wx9 wx9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                wx9Var.getNotificationCenter().k(36, encryptedChat);
                wx9Var.w(encryptedChat, null);
                break;
            case 1:
                wx9Var.getNotificationCenter().k(36, encryptedChat);
                wx9Var.w(encryptedChat, null);
                break;
            default:
                wx9Var.getNotificationCenter().k(36, encryptedChat);
                break;
        }
    }
}
