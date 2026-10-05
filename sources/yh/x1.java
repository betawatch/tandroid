package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ x1(y3 y3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).processUpdates(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.currentAccount).processUpdates(this.c.updates, false);
                break;
        }
    }
}
