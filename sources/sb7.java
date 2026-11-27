// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        kf7.a0(i).a.c(new hl3(i, (TLRPC.TL_help_appConfig) obj2, (byte) 25));
    }

    @Override // b71
    public final boolean j(Object obj) {
        return false;
    }
}
