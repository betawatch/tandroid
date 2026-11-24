// default package

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uh1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ qac d;

    public /* synthetic */ uh1(jva jvaVar, TLObject tLObject, TLRPC.TL_error tL_error, qac qacVar) {
        this.b = tLObject;
        this.c = tL_error;
        this.d = qacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qac qacVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject == null) {
                    d Q = LaunchActivity.Q();
                    if (tL_error == null || Q == null || !"CHANNEL_PRIVATE".equals(tL_error.text)) {
                        c41.Y().g0(tL_error, false);
                    } else {
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || !launchActivity.isFinishing()) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = jb6.M0(R.string.AppName, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            HashMap hashMap = new HashMap();
                            int i = cmb.K5;
                            hashMap.put("info1", Integer.valueOf(cmb.w0(null, i, false)));
                            hashMap.put("info2", Integer.valueOf(cmb.w0(null, i, false)));
                            alertDialog$Builder.l(R.raw.not_available, 52, cmb.w0(null, i, false), hashMap);
                            heVar.X = true;
                            heVar.S = jb6.M0(2131752271, null);
                            heVar.U = jb6.M0(2131752387, null);
                            b10.t(null, 2131751978, alertDialog$Builder, null);
                        }
                    }
                    qacVar.a(null);
                    break;
                } else {
                    qacVar.a((TL_stories.TL_premium_boostsStatus) tLObject);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    jva.c(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                    qacVar.a(null);
                    break;
                } else {
                    qacVar.a((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                    break;
                }
        }
    }

    public /* synthetic */ uh1(TLObject tLObject, qac qacVar, TLRPC.TL_error tL_error) {
        this.b = tLObject;
        this.d = qacVar;
        this.c = tL_error;
    }
}
