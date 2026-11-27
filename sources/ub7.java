// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        jf7.Y(i).a.c(new hl3(i, obj2, (byte) 26));
    }

    @Override // b71
    public final void h(int i, long j) {
        this.e.X3.edit().putLong("effects_last_" + i, j).apply();
    }
}
