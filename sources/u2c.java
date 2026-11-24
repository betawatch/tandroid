// default package

import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class u2c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ u2c(TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
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
                    gl.E3(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                u2c u2cVar = twoStepVerificationActivity.W;
                gl.r(u2cVar);
                gl.d3(u2cVar, 1500L);
                twoStepVerificationActivity.V = true;
                break;
            case 2:
                twoStepVerificationActivity.V = false;
                twoStepVerificationActivity.w.a(0.0f);
                break;
            default:
                twoStepVerificationActivity.C0();
                break;
        }
    }
}
