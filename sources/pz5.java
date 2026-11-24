// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
