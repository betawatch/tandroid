// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zj8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ zj8(PremiumPreviewFragment premiumPreviewFragment, byte b) {
        this.a = b;
        this.b = premiumPreviewFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        PremiumPreviewFragment premiumPreviewFragment = this.b;
        switch (b) {
            case 0:
                premiumPreviewFragment.n0();
                break;
            case 1:
                premiumPreviewFragment.a.postOnAnimation(new zj8(premiumPreviewFragment, b2));
                break;
            default:
                premiumPreviewFragment.getMediaDataController().T0(false);
                break;
        }
    }
}
