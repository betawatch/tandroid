package yh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ d(h hVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                hVar.h0.setLoading(false);
                hVar.presentFragment(this.c);
                break;
            default:
                h hVar2 = this.b;
                hVar2.a0.setLoading(false);
                hVar2.presentFragment(this.c);
                break;
        }
    }
}
