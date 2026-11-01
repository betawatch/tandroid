package rh;

import org.telegram.messenger.e20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ u0(e4 e4Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        this.b = e4Var;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
        this.f = z10;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TwoStepVerificationActivity twoStepVerificationActivity;
        switch (this.a) {
            case 0:
                TLObject tLObject = this.e;
                boolean z10 = tLObject instanceof TL_account.tmpPassword;
                e4 e4Var = this.b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                boolean z11 = this.f;
                if (!z10) {
                    e4Var.Q1(this.c, twoStepVerificationActivity2, z11);
                    break;
                } else {
                    TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
                    e20.i(e4Var.a).y = tmppassword;
                    e20.i(e4Var.a).v(false);
                    e4Var.J1(tmppassword.tmp_password, twoStepVerificationActivity2, z11, null);
                    break;
                }
            default:
                if (this.c == null && (twoStepVerificationActivity = this.d) != null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    TLRPC.TL_inputCheckPasswordSRP q02 = twoStepVerificationActivity.q0();
                    TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
                    gettmppassword.password = q02;
                    gettmppassword.period = 600;
                    e4 e4Var2 = this.b;
                    ConnectionsManager.getInstance(e4Var2.a).sendRequest(gettmppassword, new a2(e4Var2, twoStepVerificationActivity, this.f, 0));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u0(e4 e4Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, boolean z10) {
        this.b = e4Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
        this.f = z10;
    }
}
