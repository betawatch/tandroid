package xh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ c(h hVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                hVar.Y.setLoading(false);
                hVar.presentFragment(this.c);
                break;
            default:
                h hVar2 = this.b;
                hVar2.R.setLoading(false);
                hVar2.presentFragment(this.c);
                break;
        }
    }
}
