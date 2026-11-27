// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p15 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ p15(e eVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(twoStepVerificationActivity);
                break;
            default:
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                eVar.showAsSheet(twoStepVerificationActivity, bg0Var);
                break;
        }
    }
}
