package rh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ f2(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final e4 e4Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e4 e4Var2 = e4Var;
                                w0 w0Var = e4Var2.m3;
                                e4Var2.j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    wb Y = e4Var2.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    vp.r1(e4Var2.a).V3(paymentForm.users, false);
                                    e4Var2.k3 = paymentForm;
                                    org.telegram.messenger.i0.r(w0Var);
                                    org.telegram.messenger.i0.g3(w0Var);
                                    break;
                                }
                            default:
                                e4 e4Var3 = e4Var;
                                e4Var3.j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    wb Y2 = e4Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    vp.r1(e4Var3.a).V3(paymentForm2.users, false);
                                    e4Var3.k3 = paymentForm2;
                                    e4Var3.a2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final e4 e4Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e4 e4Var22 = e4Var2;
                                w0 w0Var = e4Var22.m3;
                                e4Var22.j3 = false;
                                TLObject tLObject2 = tLObject;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    wb Y = e4Var22.k().Y(tL_error);
                                    Y.t = true;
                                    Y.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    vp.r1(e4Var22.a).V3(paymentForm.users, false);
                                    e4Var22.k3 = paymentForm;
                                    org.telegram.messenger.i0.r(w0Var);
                                    org.telegram.messenger.i0.g3(w0Var);
                                    break;
                                }
                            default:
                                e4 e4Var3 = e4Var2;
                                e4Var3.j3 = false;
                                TLObject tLObject3 = tLObject;
                                if (!(tLObject3 instanceof TLRPC.PaymentForm)) {
                                    wb Y2 = e4Var3.k().Y(tL_error);
                                    Y2.t = true;
                                    Y2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                                    vp.r1(e4Var3.a).V3(paymentForm2.users, false);
                                    e4Var3.k3 = paymentForm2;
                                    e4Var3.a2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
