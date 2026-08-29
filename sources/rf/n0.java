package rf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ MessagesStorage d;
    public final /* synthetic */ v0 e;

    public n0(v0 v0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = v0Var;
        this.a = str;
        this.b = str2;
        this.c = messagesController;
        this.d = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0 v0Var = this.e;
        if (v0Var.u0 != this) {
            return;
        }
        v0Var.u0 = null;
        TLRPC.User user = v0Var.s0;
        if (user != null || v0Var.r0) {
            if (v0Var.r0) {
                return;
            }
            v0Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        v0Var.m0 = str;
        MessagesController messagesController = this.c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            v0Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = v0Var.m0;
        v0Var.p0 = ConnectionsManager.getInstance(v0Var.f).sendRequest(tL_contacts_resolveUsername, new ih.c1(this, str, messagesController, this.d, 18));
    }
}
