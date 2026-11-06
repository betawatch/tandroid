package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class yu0 implements hp {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ kp b;
    public final /* synthetic */ ProfileActivity c;

    public yu0(ProfileActivity profileActivity, TLRPC.Chat chat, kp kpVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = kpVar;
    }

    @Override // org.telegram.ui.hp
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.L.m(-profileActivity.e1, user, profileActivity.D2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.hp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1));
        if (a22 == null || (chat = this.a) == null || profileActivity.d1 == 0) {
            return;
        }
        kp kpVar = this.b;
        if (!kpVar.Q || kpVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.f2 f2Var : kpVar.getParentLayout().getFragmentStack()) {
            if (f2Var instanceof mb) {
                mb mbVar = (mb) f2Var;
                mbVar.a1();
                org.telegram.messenger.g0.h3(new mc0(mbVar, a22, chat, 28));
                return;
            }
        }
    }
}
