// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class s47 extends r47 {
    public final /* synthetic */ byte u3;
    public final /* synthetic */ v47 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s47(v47 v47Var, int i, TLRPC.TL_message tL_message, int i2) {
        super(i, tL_message, true, false);
        this.v3 = v47Var;
        this.u3 = i2;
    }

    @Override // r47
    public final boolean m5() {
        if (this.v3.k) {
            return false;
        }
        return super.m5();
    }

    @Override // r47
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.u3 == 2) {
            this.v3.b(this);
        }
    }
}
