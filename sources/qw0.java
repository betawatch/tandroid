// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sw0 b;

    public /* synthetic */ qw0(sw0 sw0Var, byte b) {
        this.a = b;
        this.b = sw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sw0 sw0Var = this.b;
        switch (b) {
            case 0:
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                xw0 xw0Var = sw0Var.d;
                toggleuseremojistatuspermission.bot = uc7.s1(xw0Var.I).o1(xw0Var.J);
                toggleuseremojistatuspermission.enabled = false;
                ConnectionsManager.getInstance(xw0Var.I).sendRequest(toggleuseremojistatuspermission, new rw0(sw0Var, (byte) 1));
                break;
            case 1:
                xw0 xw0Var2 = sw0Var.d;
                tq0.d(xw0Var2.getContext(), xw0Var2.I, xw0Var2.J).k(false, null);
                break;
            default:
                xw0 xw0Var3 = sw0Var.d;
                e S = LaunchActivity.S();
                if (S != null && S.getParentLayout() != null) {
                    wk5 parentLayout = S.getParentLayout();
                    S.presentFragment(ProfileActivity.Q2(xw0Var3.J));
                    hl.f3(parentLayout, "botPermissionLocation");
                    xw0Var3.m(true);
                    break;
                }
                break;
        }
    }
}
