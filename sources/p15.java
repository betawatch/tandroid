// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
