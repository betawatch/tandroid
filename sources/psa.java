// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class psa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ psa(wua wuaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                uc7.s1(wuaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
            default:
                uc7.s1(wuaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
        }
    }
}
