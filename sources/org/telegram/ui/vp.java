package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;

    public /* synthetic */ vp(dq dqVar, int i10) {
        this.a = i10;
        this.b = dqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        dq dqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = dqVar.w;
                aq aqVar = dqVar.Y0;
                if (aqVar != null) {
                    aqVar.b(0, dqVar.L ? dqVar.N : null, null, dqVar.T);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", dqVar.x.id);
                if (!dqVar.getMessagesController().checkCanOpenChat(h, dqVar)) {
                    dqVar.t0(false);
                    break;
                } else {
                    sn snVar = new sn(h);
                    dqVar.presentFragment(snVar, true);
                    if (org.telegram.ui.Components.xc.a(snVar)) {
                        boolean z10 = dqVar.a1;
                        if (!z10 || !dqVar.L) {
                            if (!z10 && !dqVar.M && dqVar.L) {
                                org.telegram.ui.Components.xc.C(snVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(snVar.getParentActivity(), snVar.qa);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(snVar, ybVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                dqVar.r0(false);
                break;
            default:
                if (dqVar.s) {
                    long j10 = dqVar.r;
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(dqVar.getParentActivity(), 3, null)};
                    dqVar.getMessagesController().toggleChatJoinRequest(dqVar.v, j10, true, false, true, new ng(c2VarArr, 2), new ng(c2VarArr, 3));
                    c2VarArr[0].r(300L);
                }
                aq aqVar2 = dqVar.Y0;
                if (aqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.N;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!dqVar.H || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!dqVar.F || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    aqVar2.b(i11, tL_chatAdminRights, dqVar.P, dqVar.T);
                    dqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
