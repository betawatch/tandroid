// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xsa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ xsa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.getClass();
                final byte b2 = 1;
                hl.c3(new Runnable() { // from class: qra
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wua wuaVar2 = wuaVar;
                        switch (b3) {
                            case 0:
                                jra jraVar = wuaVar2.s3;
                                wuaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    v21 Z = wuaVar2.j().Z(tL_error2);
                                    Z.u = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm.users, false);
                                    wuaVar2.q3 = paymentForm;
                                    hl.r(jraVar);
                                    hl.c3(jraVar);
                                    break;
                                }
                            default:
                                wuaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    v21 Z2 = wuaVar2.j().Z(tL_error2);
                                    Z2.u = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm2.users, false);
                                    wuaVar2.q3 = paymentForm2;
                                    wuaVar2.f2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                hl.c3(new Runnable() { // from class: qra
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        wua wuaVar2 = wuaVar;
                        switch (b32) {
                            case 0:
                                jra jraVar = wuaVar2.s3;
                                wuaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    v21 Z = wuaVar2.j().Z(tL_error2);
                                    Z.u = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm.users, false);
                                    wuaVar2.q3 = paymentForm;
                                    hl.r(jraVar);
                                    hl.c3(jraVar);
                                    break;
                                }
                            default:
                                wuaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    v21 Z2 = wuaVar2.j().Z(tL_error2);
                                    Z2.u = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    uc7.s1(wuaVar2.a).j4(paymentForm2.users, false);
                                    wuaVar2.q3 = paymentForm2;
                                    wuaVar2.f2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
