package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tz0 implements qq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ tq b;
    public final /* synthetic */ ProfileActivity c;

    public tz0(ProfileActivity profileActivity, TLRPC.Chat chat, tq tqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = tqVar;
    }

    @Override // org.telegram.ui.qq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.qq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        tq tqVar = this.b;
        if (!tqVar.Q || tqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.m2 m2Var : tqVar.getParentLayout().getFragmentStack()) {
            if (m2Var instanceof ac) {
                ac acVar = (ac) m2Var;
                acVar.V0();
                AndroidUtilities.runOnUIThread(new uf0(acVar, user, chat, 25));
                return;
            }
        }
    }
}
