package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ r4(s5 s5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = s5Var;
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
