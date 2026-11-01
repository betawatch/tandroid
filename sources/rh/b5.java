package rh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                wp.r1(this.b.a).L3(this.c.updates, false);
                break;
            case 1:
                wp.r1(this.b.a).L3(this.c.updates, false);
                break;
            case 2:
                wp.r1(this.b.a).L3(this.c.updates, false);
                break;
            case 3:
                wp.r1(this.b.a).L3(this.c.updates, false);
                break;
            default:
                wp.r1(this.b.a).L3(this.c.updates, false);
                break;
        }
    }
}
