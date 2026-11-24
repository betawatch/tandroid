// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z08 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ z08(p pVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    pVar.b0 = password;
                    if (!TwoStepVerificationActivity.b0(password, false)) {
                        ik.u0(pVar.getParentActivity(), jb6.M0(2131743507, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = pVar.D0;
                        if (paymentForm != null && pVar.b0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            pVar.Q0();
                        }
                        TwoStepVerificationActivity.f0(pVar.b0);
                        p pVar2 = pVar.g0;
                        if (pVar2 != null) {
                            pVar2.I0(pVar.b0);
                        }
                        if (!pVar.b0.has_password && pVar.e0 == null) {
                            x08 x08Var = new x08(pVar, (byte) 2);
                            pVar.e0 = x08Var;
                            gm.d3(x08Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                pVar.w0(tLObject, tL_error);
                break;
            default:
                pVar.z0(tLObject, tL_error);
                break;
        }
    }
}
