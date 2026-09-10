package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rz0 implements oq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ rq b;
    public final /* synthetic */ ProfileActivity c;

    public rz0(ProfileActivity profileActivity, TLRPC.Chat chat, rq rqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = rqVar;
    }

    @Override // org.telegram.ui.oq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.oq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        rq rqVar = this.b;
        if (!rqVar.Q || rqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.p2 p2Var : rqVar.getParentLayout().getFragmentStack()) {
            if (p2Var instanceof wb) {
                wb wbVar = (wb) p2Var;
                wbVar.W0();
                AndroidUtilities.runOnUIThread(new pf0(wbVar, user, chat, 25));
                return;
            }
        }
    }
}
