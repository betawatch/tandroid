package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;

    public /* synthetic */ tp(bq bqVar, int i10) {
        this.a = i10;
        this.b = bqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        bq bqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = bqVar.v;
                yp ypVar = bqVar.X0;
                if (ypVar != null) {
                    ypVar.b(0, bqVar.K ? bqVar.M : null, null, bqVar.S);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", bqVar.w.id);
                if (!bqVar.getMessagesController().checkCanOpenChat(h, bqVar)) {
                    bqVar.t0(false);
                    break;
                } else {
                    qn qnVar = new qn(h);
                    bqVar.presentFragment(qnVar, true);
                    if (org.telegram.ui.Components.xc.a(qnVar)) {
                        boolean z10 = bqVar.Z0;
                        if (!z10 || !bqVar.K) {
                            if (!z10 && !bqVar.L && bqVar.K) {
                                org.telegram.ui.Components.xc.C(qnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(qnVar.getParentActivity(), qnVar.ea);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(qnVar, ybVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                bqVar.r0(false);
                break;
            default:
                if (bqVar.r) {
                    long j10 = bqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(bqVar.getParentActivity(), 3, null)};
                    bqVar.getMessagesController().toggleChatJoinRequest(bqVar.s, j10, true, false, true, new ng(b2VarArr, 2), new ng(b2VarArr, 3));
                    b2VarArr[0].r(300L);
                }
                yp ypVar2 = bqVar.X0;
                if (ypVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!bqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!bqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    ypVar2.b(i11, tL_chatAdminRights, bqVar.O, bqVar.S);
                    bqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
