package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = x3Var;
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
