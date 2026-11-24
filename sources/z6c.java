// default package

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ z6c(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (b) {
            case 0:
                userInfoActivity.presentFragment(new PrivacyControlActivity(9, true));
                break;
            case 1:
                va vaVar = userInfoActivity.y;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
            case 2:
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                break;
            default:
                userInfoActivity.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                break;
        }
    }
}
