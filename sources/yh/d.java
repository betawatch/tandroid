package yh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
