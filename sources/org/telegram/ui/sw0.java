package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ sw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.a = i10;
        this.b = privacyControlActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            case 1:
                PrivacyControlActivity.U(this.b);
                break;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
        }
    }
}
