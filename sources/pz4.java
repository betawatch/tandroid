// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pz4 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ pz4(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                twoStepVerificationActivity.presentFragment(new p3c(6, null));
                break;
            case 1:
                twoStepVerificationActivity.finishFragment();
                break;
            case 2:
                twoStepVerificationActivity.getConnectionsManager().sendRequest(new TL_account.declinePasswordReset(), new t2c(twoStepVerificationActivity, (byte) 2));
                break;
            case 3:
                twoStepVerificationActivity.c0();
                break;
            case 4:
                twoStepVerificationActivity.y0();
                break;
            default:
                twoStepVerificationActivity.y0();
                break;
        }
    }
}
