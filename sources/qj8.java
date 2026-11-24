// default package

import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
