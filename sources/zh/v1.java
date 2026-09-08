package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ v1(w3 w3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = w3Var;
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
