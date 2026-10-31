package xh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ f2(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                h2 h2Var = this.b;
                m2 m2Var = h2Var.d;
                toggleuseremojistatuspermission.bot = vp.r1(m2Var.H).n1(m2Var.I);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(m2Var.H).sendRequest(toggleuseremojistatuspermission, new g2(h2Var, 1));
                break;
            case 1:
                m2 m2Var2 = this.b.d;
                o0.e(m2Var2.getContext(), m2Var2.H, m2Var2.I).l(false, null);
                break;
            default:
                m2 m2Var3 = this.b.d;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null && T.getParentLayout() != null) {
                    z4 parentLayout = T.getParentLayout();
                    T.presentFragment(ProfileActivity.z4(m2Var3.I));
                    org.telegram.messenger.i0.j3(parentLayout, "botPermissionLocation");
                    m2Var3.o(true);
                    break;
                }
                break;
        }
    }
}
