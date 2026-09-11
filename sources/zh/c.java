package zh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
