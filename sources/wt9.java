// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu9 b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ wt9(bu9 bu9Var, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                bu9Var.getMessagesController().W3(tL_encryptedChatDiscarded, false);
                bu9Var.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                bu9Var.getMessagesController().W3(tL_encryptedChatDiscarded, false);
                bu9Var.getMessagesStorage().S1(tL_encryptedChatDiscarded);
                bu9Var.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
