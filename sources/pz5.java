// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pz5 implements wc2 {
    public final /* synthetic */ cj3 a;
    public final /* synthetic */ int b;

    public pz5(cj3 cj3Var, int i) {
        this.a = cj3Var;
        this.b = i;
    }

    @Override // wc2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        kk7.f(this.b).k(kk7.s, new Object[0]);
    }

    @Override // wc2
    public final void a(TLRPC.User user) {
    }
}
