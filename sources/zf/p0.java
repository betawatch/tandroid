package zf;

import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vp c;
    public final /* synthetic */ hs d;
    public final /* synthetic */ x0 e;

    public p0(x0 x0Var, String str, String str2, vp vpVar, hs hsVar) {
        this.e = x0Var;
        this.a = str;
        this.b = str2;
        this.c = vpVar;
        this.d = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var = this.e;
        if (x0Var.y0 != this) {
            return;
        }
        x0Var.y0 = null;
        TLRPC.User user = x0Var.w0;
        if (user != null || x0Var.v0) {
            if (x0Var.v0) {
                return;
            }
            x0Var.T(true, user, this.a, "");
            return;
        }
        String str = this.b;
        x0Var.q0 = str;
        vp vpVar = this.c;
        TLObject e22 = vpVar.e2(str);
        if (e22 instanceof TLRPC.User) {
            x0Var.R((TLRPC.User) e22);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = x0Var.q0;
        x0Var.t0 = ConnectionsManager.getInstance(x0Var.f).sendRequest(tL_contacts_resolveUsername, new mb(this, str, vpVar, this.d, 19));
    }
}
