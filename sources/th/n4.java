package th;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n4 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ u70 b;
    public final /* synthetic */ e5 c;

    public n4(e5 e5Var, long j10, u70 u70Var) {
        this.c = e5Var;
        this.a = j10;
        this.b = u70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new ag.a3(this, tLObject, this.a, this.b, 24));
    }
}
