// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ub7 extends b71 {
    public final /* synthetic */ uc7 e;

    public ub7(uc7 uc7Var) {
        this.e = uc7Var;
    }

    @Override // b71
    public final boolean b(Object obj) {
        return true;
    }

    @Override // b71
    public final void e(int i, Object obj, icc iccVar) {
        this.e.getMessagesStorage().a.c(new qb7(i, (f) iccVar, (byte) 1));
    }

    @Override // b71
    public final void f(int i, Object obj, long j, a71 a71Var) {
        TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
        tL_messages_getAvailableEffects.hash = (int) j;
        this.e.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new rb7(a71Var, (byte) 1));
    }

    @Override // b71
    public final void g(int i, Object obj, Object obj2) {
        kf7.a0(i).a.c(new hl3(i, obj2, (byte) 26));
    }

    @Override // b71
    public final void h(int i, long j) {
        this.e.Y3.edit().putLong("effects_last_" + i, j).apply();
    }
}
