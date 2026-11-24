// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class z67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ z67(oc7 oc7Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.g(chat);
                break;
            case 1:
                oc7Var.getNotificationCenter().k(91, chat);
                break;
            case 2:
                oc7Var.C(chat.id, true);
                break;
            case 3:
                oc7Var.getNotificationCenter().k(91, chat);
                break;
            case 4:
                oc7Var.getNotificationCenter().k(nm7.v5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                oc7Var.b5(null);
                oc7Var.getNotificationCenter().k(nm7.X5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
