// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
