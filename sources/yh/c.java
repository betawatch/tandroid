package yh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
