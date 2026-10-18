package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                TLRPC.User user = dqVar.v;
                aq aqVar = dqVar.X0;
                if (aqVar != null) {
                    aqVar.b(0, dqVar.K ? dqVar.M : null, null, dqVar.S);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", dqVar.w.id);
                if (!dqVar.getMessagesController().checkCanOpenChat(h, dqVar)) {
                    dqVar.t0(false);
                    break;
                } else {
                    sn snVar = new sn(h);
                    dqVar.presentFragment(snVar, true);
                    if (org.telegram.ui.Components.xc.a(snVar)) {
                        boolean z10 = dqVar.Z0;
                        if (!z10 || !dqVar.K) {
                            if (!z10 && !dqVar.L && dqVar.K) {
                                org.telegram.ui.Components.xc.C(snVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(snVar.getParentActivity(), snVar.ea);
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
                if (dqVar.r) {
                    long j10 = dqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(dqVar.getParentActivity(), 3, null)};
                    dqVar.getMessagesController().toggleChatJoinRequest(dqVar.s, j10, true, false, true, new pg(b2VarArr, 2), new pg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                aq aqVar2 = dqVar.X0;
                if (aqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!dqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!dqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    aqVar2.b(i11, tL_chatAdminRights, dqVar.O, dqVar.S);
                    dqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
