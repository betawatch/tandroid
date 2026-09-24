package yh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ c(g gVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = gVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                gVar.Y.setLoading(false);
                gVar.presentFragment(this.c);
                break;
            default:
                g gVar2 = this.b;
                gVar2.R.setLoading(false);
                gVar2.presentFragment(this.c);
                break;
        }
    }
}
