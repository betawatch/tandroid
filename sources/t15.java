// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t15 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ t15(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                twoStepVerificationActivity.presentFragment(new o7c(6, null));
                break;
            case 1:
                twoStepVerificationActivity.finishFragment();
                break;
            case 2:
                twoStepVerificationActivity.getConnectionsManager().sendRequest(new TL_account.declinePasswordReset(), new t6c(twoStepVerificationActivity, (byte) 2));
                break;
            case 3:
                twoStepVerificationActivity.c0();
                break;
            case 4:
                twoStepVerificationActivity.z0();
                break;
            default:
                twoStepVerificationActivity.z0();
                break;
        }
    }
}
