package rh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ b5(e6 e6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = e6Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vp.r1(this.b.a).L3(this.c.updates, false);
                break;
            case 1:
                vp.r1(this.b.a).L3(this.c.updates, false);
                break;
            case 2:
                vp.r1(this.b.a).L3(this.c.updates, false);
                break;
            case 3:
                vp.r1(this.b.a).L3(this.c.updates, false);
                break;
            default:
                vp.r1(this.b.a).L3(this.c.updates, false);
                break;
        }
    }
}
