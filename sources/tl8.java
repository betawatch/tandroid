// default package

import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tl8 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ tl8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        PrivacyControlActivity privacyControlActivity = this.b;
        switch (b) {
            case 0:
                privacyControlActivity.J0();
                break;
            case 1:
                privacyControlActivity.finishFragment();
                break;
            default:
                privacyControlActivity.finishFragment();
                break;
        }
    }
}
