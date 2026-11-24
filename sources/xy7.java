// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xy7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ xy7(p pVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
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
                    if (!TwoStepVerificationActivity.a0(password, false)) {
                        ij.u0(pVar.getParentActivity(), k96.M0(2131743581, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = pVar.D0;
                        if (paymentForm != null && pVar.b0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            pVar.P0();
                        }
                        TwoStepVerificationActivity.e0(pVar.b0);
                        p pVar2 = pVar.g0;
                        if (pVar2 != null) {
                            pVar2.H0(pVar.b0);
                        }
                        if (!pVar.b0.has_password && pVar.e0 == null) {
                            vy7 vy7Var = new vy7(pVar, (byte) 2);
                            pVar.e0 = vy7Var;
                            gl.d3(vy7Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                pVar.v0(tLObject, tL_error);
                break;
            default:
                pVar.y0(tLObject, tL_error);
                break;
        }
    }
}
