// default package

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vg1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ pcc d;

    public /* synthetic */ vg1(jxa jxaVar, TLObject tLObject, TLRPC.TL_error tL_error, pcc pccVar) {
        this.b = tLObject;
        this.c = tL_error;
        this.d = pccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject == null) {
                    e Q = LaunchActivity.Q();
                    if (tL_error == null || Q == null || !"CHANNEL_PRIVATE".equals(tL_error.text)) {
                        d31.Y().g0(tL_error, false);
                    } else {
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || !launchActivity.isFinishing()) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = ob6.M0(R.string.AppName, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            HashMap hashMap = new HashMap();
                            int i = aob.L5;
                            hashMap.put("info1", Integer.valueOf(aob.w0(null, i, false)));
                            hashMap.put("info2", Integer.valueOf(aob.w0(null, i, false)));
                            alertDialog$Builder.l(R.raw.not_available, 52, aob.w0(null, i, false), hashMap);
                            idVar.X = true;
                            idVar.S = ob6.M0(2131752299, null);
                            idVar.U = ob6.M0(2131752415, null);
                            c00.u(null, 2131752006, alertDialog$Builder, null);
                        }
                    }
                    pccVar.a(null);
                    break;
                } else {
                    pccVar.a((TL_stories.TL_premium_boostsStatus) tLObject);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    jxa.c(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                    pccVar.a(null);
                    break;
                } else {
                    pccVar.a((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                    break;
                }
        }
    }

    public /* synthetic */ vg1(TLObject tLObject, pcc pccVar, TLRPC.TL_error tL_error) {
        this.b = tLObject;
        this.d = pccVar;
        this.c = tL_error;
    }
}
