// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xoa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ xoa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.getClass();
                final byte b2 = 1;
                gl.c3(new Runnable() { // from class: una
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        vqa vqaVar2 = vqaVar;
                        switch (b3) {
                            case 0:
                                nna nnaVar = vqaVar2.s3;
                                vqaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    m21 Z = vqaVar2.j().Z(tL_error2);
                                    Z.t = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).b4(paymentForm.users, false);
                                    vqaVar2.q3 = paymentForm;
                                    gl.r(nnaVar);
                                    gl.c3(nnaVar);
                                    break;
                                }
                            default:
                                vqaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    m21 Z2 = vqaVar2.j().Z(tL_error2);
                                    Z2.t = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).b4(paymentForm2.users, false);
                                    vqaVar2.q3 = paymentForm2;
                                    vqaVar2.e2();
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.c3(new Runnable() { // from class: una
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        vqa vqaVar2 = vqaVar;
                        switch (b32) {
                            case 0:
                                nna nnaVar = vqaVar2.s3;
                                vqaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    m21 Z = vqaVar2.j().Z(tL_error2);
                                    Z.t = true;
                                    Z.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).b4(paymentForm.users, false);
                                    vqaVar2.q3 = paymentForm;
                                    gl.r(nnaVar);
                                    gl.c3(nnaVar);
                                    break;
                                }
                            default:
                                vqaVar2.p3 = false;
                                if (!(tLObject2 instanceof TLRPC.PaymentForm)) {
                                    m21 Z2 = vqaVar2.j().Z(tL_error2);
                                    Z2.t = true;
                                    Z2.j();
                                    break;
                                } else {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).b4(paymentForm2.users, false);
                                    vqaVar2.q3 = paymentForm2;
                                    vqaVar2.e2();
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
