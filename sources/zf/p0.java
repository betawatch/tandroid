package zf;

import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mb;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wp c;
    public final /* synthetic */ is d;
    public final /* synthetic */ x0 e;

    public p0(x0 x0Var, String str, String str2, wp wpVar, is isVar) {
        this.e = x0Var;
        this.a = str;
        this.b = str2;
        this.c = wpVar;
        this.d = isVar;
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
        wp wpVar = this.c;
        TLObject e22 = wpVar.e2(str);
        if (e22 instanceof TLRPC.User) {
            x0Var.R((TLRPC.User) e22);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = x0Var.q0;
        x0Var.t0 = ConnectionsManager.getInstance(x0Var.f).sendRequest(tL_contacts_resolveUsername, new mb(this, str, wpVar, this.d, 19));
    }
}
