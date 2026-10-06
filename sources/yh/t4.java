package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ t4(u5 u5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = u5Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            case 1:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            case 2:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            case 3:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
        }
    }
}
