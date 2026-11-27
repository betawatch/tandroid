// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
