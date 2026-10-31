package rh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ g5(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new k5(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new k5(this.b, tLObject, 1));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new k5(this.b, tLObject, 2));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new k5(this.b, tLObject, 3));
                break;
            default:
                org.telegram.messenger.i0.g3(new k5(this.b, tLObject, 4));
                break;
        }
    }
}
