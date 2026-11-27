// default package

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zac implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ zac(UserInfoActivity userInfoActivity, byte b) {
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
                wa waVar = userInfoActivity.y;
                if (waVar != null) {
                    waVar.g3.O(true);
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
