package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wu0 implements jp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ ProfileActivity c;

    public wu0(ProfileActivity profileActivity, TLRPC.Chat chat, mp mpVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = mpVar;
    }

    @Override // org.telegram.ui.jp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.jp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
        if (a22 == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        mp mpVar = this.b;
        if (!mpVar.R || mpVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.e2 e2Var : mpVar.getParentLayout().getFragmentStack()) {
            if (e2Var instanceof lb) {
                lb lbVar = (lb) e2Var;
                lbVar.a1();
                org.telegram.messenger.g0.h3(new lc0(lbVar, a22, chat, 28));
                return;
            }
        }
    }
}
