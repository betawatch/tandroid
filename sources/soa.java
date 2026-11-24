// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class soa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ soa(vqa vqaVar, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, TLRPC.TL_error tL_error) {
        this.b = vqaVar;
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
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                if (!(tLObject instanceof TL_account.tmpPassword)) {
                    vqaVar.P1(tL_error, twoStepVerificationActivity, z);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    y6c.h(vqaVar.a).y = tmppassword;
                    y6c.h(vqaVar.a).u(false);
                    vqaVar.C1(tmppassword.tmp_password, twoStepVerificationActivity, z, null);
                    break;
                }
            default:
                if (tL_error == null && twoStepVerificationActivity != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    TLRPC.TL_inputCheckPasswordSRP d0 = twoStepVerificationActivity.d0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = d0;
                    gettmppassword.period = 600;
                    ConnectionsManager.getInstance(vqaVar.a).sendRequest(gettmppassword, new poa(vqaVar, twoStepVerificationActivity, z, b2));
                    break;
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                    }
                    u21.c0(tL_error != null ? tL_error.text : "NULL_ERROR");
                    break;
                }
        }
    }

    public /* synthetic */ soa(vqa vqaVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z) {
        this.b = vqaVar;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z;
    }
}
