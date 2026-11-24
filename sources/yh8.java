// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yh8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ yh8(PremiumPreviewFragment premiumPreviewFragment, byte b) {
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
                premiumPreviewFragment.m0();
                break;
            case 1:
                premiumPreviewFragment.a.postOnAnimation(new yh8(premiumPreviewFragment, b2));
                break;
            default:
                premiumPreviewFragment.getMediaDataController().T0(false);
                break;
        }
    }
}
