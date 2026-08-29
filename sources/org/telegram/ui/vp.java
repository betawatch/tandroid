package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                aq aqVar = dqVar.T0;
                if (aqVar != null) {
                    aqVar.b(0, dqVar.G ? dqVar.I : null, null, dqVar.O);
                }
                Bundle i12 = a4.w.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", dqVar.w.id);
                if (!dqVar.getMessagesController().checkCanOpenChat(i12, dqVar)) {
                    dqVar.t0(false);
                    break;
                } else {
                    tn tnVar = new tn(i12);
                    dqVar.presentFragment(tnVar, true);
                    if (org.telegram.ui.Components.tc.a(tnVar)) {
                        boolean z10 = dqVar.V0;
                        if (!z10 || !dqVar.G) {
                            if (!z10 && !dqVar.H && dqVar.G) {
                                org.telegram.ui.Components.tc.C(tnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(tnVar.getParentActivity(), tnVar.aa);
                            ubVar.d(R.raw.ic_admin, "Shield");
                            ubVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.mc.g(tnVar, ubVar, 1500).j();
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
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(dqVar.getParentActivity(), 3, null)};
                    dqVar.getMessagesController().toggleChatJoinRequest(dqVar.s, j10, true, false, true, new lg(c2VarArr, 2), new lg(c2VarArr, 3));
                    c2VarArr[0].q(300L);
                }
                aq aqVar2 = dqVar.T0;
                if (aqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.I;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!dqVar.C || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!dqVar.A || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    aqVar2.b(i11, tL_chatAdminRights, dqVar.K, dqVar.O);
                    dqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
