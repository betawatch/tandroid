// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rx0 b;

    public /* synthetic */ px0(rx0 rx0Var, byte b) {
        this.a = b;
        this.b = rx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rx0 rx0Var = this.b;
        switch (b) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                wx0 wx0Var = rx0Var.d;
                toggleuseremojistatuspermission.bot = oc7.r1(wx0Var.I).n1(wx0Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(wx0Var.I).sendRequest(toggleuseremojistatuspermission, new qx0(rx0Var, (byte) 1));
                break;
            case 1:
                wx0 wx0Var2 = rx0Var.d;
                tr0.d(wx0Var2.getContext(), wx0Var2.I, wx0Var2.J).k(false, null);
                break;
            default:
                wx0 wx0Var3 = rx0Var.d;
                d S = LaunchActivity.S();
                if (S != null && S.getParentLayout() != null) {
                    tk5 parentLayout = S.getParentLayout();
                    S.presentFragment(ProfileActivity.S2(wx0Var3.J));
                    gm.f3(parentLayout, "botPermissionLocation");
                    wx0Var3.m(true);
                    break;
                }
                break;
        }
    }
}
