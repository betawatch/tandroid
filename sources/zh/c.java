package zh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
