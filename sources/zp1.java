// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zp1 implements sc7 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ aq1 b;

    public zp1(aq1 aq1Var, boolean z) {
        this.b = aq1Var;
        this.a = z;
    }

    @Override // sc7
    public final void k(boolean z) {
        mu1 mu1Var = this.b.b;
        if (z) {
            TLRPC.User user = mu1Var.f;
            boolean z2 = this.a;
            if (user != null || z2) {
                ad7 messagesStorage = mu1Var.getMessagesStorage();
                messagesStorage.a.c(new dc7(messagesStorage, mu1Var.l6, new yp1((byte) 1, this, z2), (byte) 0));
                return;
            }
        }
        mu1Var.va(mu1Var.s4, z);
    }
}
