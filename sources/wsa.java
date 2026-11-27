// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wsa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ wua b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ wsa(wua wuaVar, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, TLRPC.TL_error tL_error) {
        this.b = wuaVar;
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
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                if (!(tLObject instanceof TL_account.tmpPassword)) {
                    wuaVar.Q1(tL_error, twoStepVerificationActivity, z);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    yac.h(wuaVar.a).y = tmppassword;
                    yac.h(wuaVar.a).u(false);
                    wuaVar.D1(tmppassword.tmp_password, twoStepVerificationActivity, z, null);
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
                    ConnectionsManager.getInstance(wuaVar.a).sendRequest(gettmppassword, new qsa(wuaVar, twoStepVerificationActivity, z, b2));
                    break;
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                    }
                    d31.c0(tL_error != null ? tL_error.text : "NULL_ERROR");
                    break;
                }
        }
    }

    public /* synthetic */ wsa(wua wuaVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z) {
        this.b = wuaVar;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z;
    }
}
