// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s16 implements md2 {
    public final /* synthetic */ uj3 a;
    public final /* synthetic */ int b;

    public s16(uj3 uj3Var, int i) {
        this.a = uj3Var;
        this.b = i;
    }

    @Override // md2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        jn7.f(this.b).k(jn7.s, new Object[0]);
    }

    @Override // md2
    public final void a(TLRPC.User user) {
    }
}
