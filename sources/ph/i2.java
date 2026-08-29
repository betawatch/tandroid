package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ i2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                k2 k2Var = this.b;
                p2 p2Var = k2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(p2Var.C).getInputUser(p2Var.D);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(p2Var.C).sendRequest(toggleuseremojistatuspermission, new j2(k2Var, 1));
                break;
            case 1:
                p2 p2Var2 = this.b.d;
                q0.e(p2Var2.getContext(), p2Var2.C, p2Var2.D).m(false, null);
                break;
            default:
                p2 p2Var3 = this.b.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    b5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(p2Var3.D));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    p2Var3.k(true);
                    break;
                }
                break;
        }
    }
}
