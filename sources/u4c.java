// default package

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u4c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ u4c(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.b;
        switch (b) {
            case 0:
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    gm.E3(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                u4c u4cVar = twoStepVerificationActivity.W;
                gm.r(u4cVar);
                gm.d3(u4cVar, 1500L);
                twoStepVerificationActivity.V = true;
                break;
            case 2:
                twoStepVerificationActivity.V = false;
                twoStepVerificationActivity.w.a(0.0f);
                break;
            default:
                twoStepVerificationActivity.D0();
                break;
        }
    }
}
