// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class z47 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ z47(na7 na7Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.g(chat);
                break;
            case 1:
                na7Var.getNotificationCenter().k(90, chat);
                break;
            case 2:
                na7Var.C(chat.id, true);
                break;
            case 3:
                na7Var.getNotificationCenter().k(90, chat);
                break;
            case 4:
                na7Var.getNotificationCenter().k(kk7.t5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                na7Var.Z4(null);
                na7Var.getNotificationCenter().k(kk7.V5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                na7Var.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
