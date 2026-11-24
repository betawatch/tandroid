// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sqa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ sqa(wsa wsaVar, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, TLRPC.TL_error tL_error) {
        this.b = wsaVar;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f = z;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        boolean z = this.f;
        TLObject tLObject = this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        TLRPC.TL_error tL_error = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                if (!(tLObject instanceof TL_account.tmpPassword)) {
                    wsaVar.P1(tL_error, twoStepVerificationActivity, z);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    z8c.h(wsaVar.a).y = tmppassword;
                    z8c.h(wsaVar.a).u(false);
                    wsaVar.C1(tmppassword.tmp_password, twoStepVerificationActivity, z, null);
                    break;
                }
            default:
                if (tL_error == null && twoStepVerificationActivity != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    TLRPC.TL_inputCheckPasswordSRP e0 = twoStepVerificationActivity.e0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = e0;
                    gettmppassword.period = 600;
                    ConnectionsManager.getInstance(wsaVar.a).sendRequest(gettmppassword, new pqa(wsaVar, twoStepVerificationActivity, z, b2));
                    break;
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    c41.c0(tL_error != null ? tL_error.text : "NULL_ERROR");
                    break;
                }
        }
    }

    public /* synthetic */ sqa(wsa wsaVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z) {
        this.b = wsaVar;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z;
    }
}
