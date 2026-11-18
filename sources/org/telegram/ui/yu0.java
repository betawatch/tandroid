package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yu0 implements kp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ np b;
    public final /* synthetic */ ProfileActivity c;

    public yu0(ProfileActivity profileActivity, TLRPC.Chat chat, np npVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = npVar;
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(-profileActivity.f1, user, profileActivity.F2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1));
        if (c22 == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        np npVar = this.b;
        if (!npVar.R || npVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.h2 h2Var : npVar.getParentLayout().getFragmentStack()) {
            if (h2Var instanceof lb) {
                lb lbVar = (lb) h2Var;
                lbVar.a1();
                org.telegram.messenger.g0.g3(new mc0(lbVar, c22, chat, 28));
                return;
            }
        }
    }
}
