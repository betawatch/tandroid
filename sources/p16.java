// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p16 implements he2 {
    public final /* synthetic */ nk3 a;
    public final /* synthetic */ int b;

    public p16(nk3 nk3Var, int i) {
        this.a = nk3Var;
        this.b = i;
    }

    @Override // he2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        nm7.f(this.b).k(nm7.s, new Object[0]);
    }

    @Override // he2
    public final void a(TLRPC.User user) {
    }
}
