package yh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
