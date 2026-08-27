package pf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ MessagesStorage d;
    public final /* synthetic */ u0 e;

    public m0(u0 u0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = u0Var;
        this.a = str;
        this.b = str2;
        this.c = messagesController;
        this.d = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u0 u0Var = this.e;
        if (u0Var.u0 != this) {
            return;
        }
        u0Var.u0 = null;
        TLRPC.User user = u0Var.s0;
        if (user != null || u0Var.r0) {
            if (u0Var.r0) {
                return;
            }
            u0Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        u0Var.m0 = str;
        MessagesController messagesController = this.c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            u0Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = u0Var.m0;
        u0Var.p0 = ConnectionsManager.getInstance(u0Var.f).sendRequest(tL_contacts_resolveUsername, new gh.f1(this, str, messagesController, this.d, 18));
    }
}
