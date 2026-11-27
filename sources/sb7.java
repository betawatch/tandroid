// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sb7 extends b71 {
    public final /* synthetic */ uc7 e;

    public sb7(uc7 uc7Var) {
        this.e = uc7Var;
    }

    @Override // b71
    public final void e(int i, Object obj, icc iccVar) {
        this.e.getMessagesStorage().a.c(new qb7(i, (f) iccVar, (byte) 0));
    }

    @Override // b71
    public final void f(int i, Object obj, long j, a71 a71Var) {
        TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
        tL_help_getAppConfig.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_help_getAppConfig, new rb7(a71Var, (byte) 0));
    }

    @Override // b71
    public final void g(int i, Object obj, Object obj2) {
        jf7.Y(i).a.c(new hl3(i, (TLRPC.TL_help_appConfig) obj2, (byte) 25));
    }

    @Override // b71
    public final boolean j(Object obj) {
        return false;
    }
}
