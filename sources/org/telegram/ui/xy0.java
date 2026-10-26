package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xy0 implements dq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ gq b;
    public final /* synthetic */ ProfileActivity c;

    public xy0(ProfileActivity profileActivity, TLRPC.Chat chat, gq gqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = gqVar;
    }

    @Override // org.telegram.ui.dq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.L.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.dq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        gq gqVar = this.b;
        if (!gqVar.Q || gqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.r2 r2Var : gqVar.getParentLayout().getFragmentStack()) {
            if (r2Var instanceof wb) {
                wb wbVar = (wb) r2Var;
                wbVar.W0();
                AndroidUtilities.runOnUIThread(new oe0(wbVar, user, chat, 28));
                return;
            }
        }
    }
}
