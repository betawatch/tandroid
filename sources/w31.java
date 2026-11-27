// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ w31(x31 x31Var, byte b) {
        this.a = b;
        this.b = x31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x31 x31Var = this.b;
        switch (b) {
            case 0:
                x31Var.b();
                break;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = x31Var.a;
                disablepeerconnectedbot.peer = uc7.s1(i).j1(x31Var.s);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                uc7.s1(i).X3.edit().remove("dialog_botid" + x31Var.s).remove("dialog_boturl" + x31Var.s).remove("dialog_botflags" + x31Var.s).apply();
                jn7.f(i).k(80, Long.valueOf(x31Var.s));
                y31.a(i).f = false;
                break;
            default:
                m01.u(x31Var.getContext(), x31Var.y);
                break;
        }
    }
}
