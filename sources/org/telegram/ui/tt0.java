package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ tt0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.a = i10;
        this.b = premiumPreviewFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n0();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.b;
                premiumPreviewFragment.a.postOnAnimation(new tt0(premiumPreviewFragment, 0));
                break;
            default:
                this.b.getMediaDataController().R0(false);
                break;
        }
    }
}
