// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v41 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w41 b;

    public /* synthetic */ v41(w41 w41Var, byte b) {
        this.a = b;
        this.b = w41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w41 w41Var = this.b;
        switch (b) {
            case 0:
                w41Var.a();
                break;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = w41Var.a;
                disablepeerconnectedbot.peer = oc7.r1(i).i1(w41Var.s);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                oc7.r1(i).W3.edit().remove("dialog_botid" + w41Var.s).remove("dialog_boturl" + w41Var.s).remove("dialog_botflags" + w41Var.s).apply();
                nm7.f(i).k(80, Long.valueOf(w41Var.s));
                x41.a(i).f = false;
                break;
            default:
                l11.u(w41Var.getContext(), w41Var.y);
                break;
        }
    }
}
