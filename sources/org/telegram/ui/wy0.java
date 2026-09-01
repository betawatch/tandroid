package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wy0 implements hq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ kq b;
    public final /* synthetic */ ProfileActivity c;

    public wy0(ProfileActivity profileActivity, TLRPC.Chat chat, kq kqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = kqVar;
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.J.m(-profileActivity.c1, user, profileActivity.B2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1));
        if (user == null || (chat = this.a) == null || profileActivity.b1 == 0) {
            return;
        }
        kq kqVar = this.b;
        if (!kqVar.N || kqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.p2 p2Var : kqVar.getParentLayout().getFragmentStack()) {
            if (p2Var instanceof sb) {
                sb sbVar = (sb) p2Var;
                sbVar.W0();
                AndroidUtilities.runOnUIThread(new if0(sbVar, user, chat, 25));
                return;
            }
        }
    }
}
