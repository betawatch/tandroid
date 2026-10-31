package rh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;

    public /* synthetic */ m5(q20 q20Var, int i10) {
        this.a = i10;
        this.b = q20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new nw0(tLObject, this.b, 1));
                break;
            default:
                org.telegram.messenger.i0.g3(new th.o0(5, this.b, tL_error));
                break;
        }
    }
}
