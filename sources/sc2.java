// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sc2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zc2 b;

    public /* synthetic */ sc2(zc2 zc2Var, byte b) {
        this.a = b;
        this.b = zc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zc2 zc2Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                TLRPC.User user = zc2Var.w;
                wc2 wc2Var = zc2Var.Y0;
                if (wc2Var != null) {
                    wc2Var.b(0, zc2Var.L ? zc2Var.N : null, null, zc2Var.T);
                }
                Bundle l = ir2.l("scrollToTopOnResume", true);
                l.putLong("chat_id", zc2Var.x.id);
                if (!zc2Var.getMessagesController().A(l, zc2Var, null, null)) {
                    zc2Var.p0(false);
                    break;
                } else {
                    mu1 mu1Var = new mu1(l);
                    zc2Var.presentFragment(mu1Var, true);
                    if (u21.a(mu1Var)) {
                        if (!zc2Var.a1) {
                            if (!zc2Var.M && zc2Var.L) {
                                u21.C(user.first_name, mu1Var).j();
                                break;
                            }
                        } else if (zc2Var.L) {
                            String str = user.first_name;
                            t11 t11Var = new t11(mu1Var.getParentActivity(), mu1Var.Ba);
                            t11Var.d(R.raw.ic_admin, "Shield");
                            de9.r("UserAddedAsAdminHint", null, 2131743529, new Object[]{str}, t11Var.b);
                            m21.g(mu1Var, t11Var, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                zc2Var.n0(false);
                break;
            default:
                if (zc2Var.r) {
                    long j = zc2Var.n;
                    hd[] hdVarArr = {new hd(3, null, zc2Var.getParentActivity())};
                    zc2Var.getMessagesController().h5(zc2Var.s, j, true, false, true, new wh0(hdVarArr, (byte) 4), new wh0(hdVarArr, (byte) 5));
                    hdVarArr[0].q(300L);
                }
                wc2 wc2Var2 = zc2Var.Y0;
                if (wc2Var2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = zc2Var.N;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!zc2Var.H || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!zc2Var.F || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i = 0;
                    }
                    wc2Var2.b(i, tL_chatAdminRights, zc2Var.P, zc2Var.T);
                    zc2Var.finishFragment();
                    break;
                }
                break;
        }
    }
}
