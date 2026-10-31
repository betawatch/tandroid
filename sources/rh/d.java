package rh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ d(i iVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = iVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                iVar.h0.setLoading(false);
                iVar.presentFragment(this.c);
                break;
            default:
                i iVar2 = this.b;
                iVar2.a0.setLoading(false);
                iVar2.presentFragment(this.c);
                break;
        }
    }
}
