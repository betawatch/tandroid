package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;

    public /* synthetic */ j2(l2 l2Var, int i10) {
        this.a = i10;
        this.b = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                l2 l2Var = this.b;
                q2 q2Var = l2Var.d;
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(q2Var.D).getInputUser(q2Var.E);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(q2Var.D).sendRequest(toggleuseremojistatuspermission, new k2(l2Var, 1));
                break;
            case 1:
                q2 q2Var2 = this.b.d;
                r0.e(q2Var2.getContext(), q2Var2.D, q2Var2.E).m(false, null);
                break;
            default:
                q2 q2Var3 = this.b.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && U.getParentLayout() != null) {
                    e5 parentLayout = U.getParentLayout();
                    U.presentFragment(ProfileActivity.m4(q2Var3.E));
                    AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
                    q2Var3.k(true);
                    break;
                }
                break;
        }
    }
}
