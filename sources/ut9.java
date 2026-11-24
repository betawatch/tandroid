// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ut9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu9 b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ ut9(bu9 bu9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                bu9Var.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                bu9Var.getNotificationCenter().k(35, encryptedChat);
                bu9Var.w(encryptedChat, null);
                break;
            default:
                bu9Var.getNotificationCenter().k(35, encryptedChat);
                bu9Var.w(encryptedChat, null);
                break;
        }
    }
}
