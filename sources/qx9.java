// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class qx9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx9 b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ qx9(wx9 wx9Var, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                wx9Var.getMessagesController().f4(tL_encryptedChatDiscarded, false);
                wx9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                break;
            default:
                wx9Var.getMessagesController().f4(tL_encryptedChatDiscarded, false);
                wx9Var.getMessagesStorage().X1(tL_encryptedChatDiscarded);
                wx9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                break;
        }
    }
}
