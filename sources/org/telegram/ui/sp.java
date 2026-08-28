package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;

    public /* synthetic */ sp(bq bqVar, int i9) {
        this.a = i9;
        this.b = bqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        bq bqVar = this.b;
        int i10 = 1;
        switch (i9) {
            case 0:
                TLRPC.User user = bqVar.v;
                yp ypVar = bqVar.T0;
                if (ypVar != null) {
                    ypVar.b(0, bqVar.G ? bqVar.I : null, null, bqVar.O);
                }
                Bundle i11 = aa.d.i("scrollToTopOnResume", true);
                i11.putLong("chat_id", bqVar.w.id);
                if (!bqVar.getMessagesController().checkCanOpenChat(i11, bqVar)) {
                    bqVar.s0(false);
                    break;
                } else {
                    qn qnVar = new qn(i11);
                    bqVar.presentFragment(qnVar, true);
                    if (org.telegram.ui.Components.oc.a(qnVar)) {
                        boolean z10 = bqVar.V0;
                        if (!z10 || !bqVar.G) {
                            if (!z10 && !bqVar.H && bqVar.G) {
                                org.telegram.ui.Components.oc.C(qnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(qnVar.getParentActivity(), qnVar.aa);
                            obVar.d(R.raw.ic_admin, "Shield");
                            obVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.gc.g(qnVar, obVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                bqVar.q0(false);
                break;
            default:
                if (bqVar.r) {
                    long j10 = bqVar.n;
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(bqVar.getParentActivity(), 3, null)};
                    bqVar.getMessagesController().toggleChatJoinRequest(bqVar.s, j10, true, false, true, new mg(c2VarArr, 2), new mg(c2VarArr, 3));
                    c2VarArr[0].q(300L);
                }
                yp ypVar2 = bqVar.T0;
                if (ypVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.I;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!bqVar.C || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!bqVar.A || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i10 = 0;
                    }
                    ypVar2.b(i10, tL_chatAdminRights, bqVar.K, bqVar.O);
                    bqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
