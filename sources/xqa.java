// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xqa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ xqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.getClass();
                final byte b2 = 1;
                gm.c3(new Runnable() { // from class: upa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b3) {
                            case 0:
                                npa npaVar = wsaVar2.s3;
                                wsaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    u31 Z = wsaVar2.j().Z(tL_error2);
                                    Z.u = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm.users, false);
                                    wsaVar2.q3 = paymentForm;
                                    gm.r(npaVar);
                                    gm.c3(npaVar);
                                    break;
                                }
                            default:
                                wsaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    u31 Z2 = wsaVar2.j().Z(tL_error2);
                                    Z2.u = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm2.users, false);
                                    wsaVar2.q3 = paymentForm2;
                                    wsaVar2.e2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: upa
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wsa wsaVar2 = wsaVar;
                        switch (b32) {
                            case 0:
                                npa npaVar = wsaVar2.s3;
                                wsaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    u31 Z = wsaVar2.j().Z(tL_error2);
                                    Z.u = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm.users, false);
                                    wsaVar2.q3 = paymentForm;
                                    gm.r(npaVar);
                                    gm.c3(npaVar);
                                    break;
                                }
                            default:
                                wsaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    u31 Z2 = wsaVar2.j().Z(tL_error2);
                                    Z2.u = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    oc7.r1(wsaVar2.a).d4(paymentForm2.users, false);
                                    wsaVar2.q3 = paymentForm2;
                                    wsaVar2.e2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
