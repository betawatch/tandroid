package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq b;

    public /* synthetic */ yp(gq gqVar, int i10) {
        this.a = i10;
        this.b = gqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        gq gqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = gqVar.v;
                dq dqVar = gqVar.X0;
                if (dqVar != null) {
                    dqVar.b(0, gqVar.K ? gqVar.M : null, null, gqVar.S);
                }
                Bundle i12 = a1.g.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", gqVar.w.id);
                if (!gqVar.getMessagesController().checkCanOpenChat(i12, gqVar)) {
                    gqVar.u0(false);
                    break;
                } else {
                    un unVar = new un(i12);
                    gqVar.presentFragment(unVar, true);
                    if (org.telegram.ui.Components.wc.a(unVar)) {
                        boolean z10 = gqVar.Z0;
                        if (!z10 || !gqVar.K) {
                            if (!z10 && !gqVar.L && gqVar.K) {
                                org.telegram.ui.Components.wc.C(unVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(unVar.getParentActivity(), unVar.qa);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(unVar, ybVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                gqVar.s0(false);
                break;
            default:
                if (gqVar.r) {
                    long j10 = gqVar.n;
                    org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(gqVar.getParentActivity(), 3, null)};
                    gqVar.getMessagesController().toggleChatJoinRequest(gqVar.s, j10, true, false, true, new qg(e2VarArr, 2), new qg(e2VarArr, 3));
                    e2VarArr[0].r(300L);
                }
                dq dqVar2 = gqVar.X0;
                if (dqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = gqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!gqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!gqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    dqVar2.b(i11, tL_chatAdminRights, gqVar.O, gqVar.S);
                    gqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
