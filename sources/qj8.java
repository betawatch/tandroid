// default package

import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qj8 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ qj8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        PrivacyControlActivity privacyControlActivity = this.b;
        switch (b) {
            case 0:
                privacyControlActivity.I0();
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
