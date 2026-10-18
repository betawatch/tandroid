package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ry0 implements aq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ dq b;
    public final /* synthetic */ ProfileActivity c;

    public ry0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = dqVar;
    }

    @Override // org.telegram.ui.aq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.g1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.aq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1));
        if (user == null || (chat = this.a) == null || profileActivity.f1 == 0) {
            return;
        }
        dq dqVar = this.b;
        if (!dqVar.Q || dqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : dqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof xb) {
                xb xbVar = (xb) n2Var;
                xbVar.V0();
                AndroidUtilities.runOnUIThread(new xe0(xbVar, user, chat, 26));
                return;
            }
        }
    }
}
