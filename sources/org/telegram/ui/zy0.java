package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zy0 implements fq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ iq b;
    public final /* synthetic */ ProfileActivity c;

    public zy0(ProfileActivity profileActivity, TLRPC.Chat chat, iq iqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = iqVar;
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.L.m(-profileActivity.f1, user, profileActivity.E2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
        if (user == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        iq iqVar = this.b;
        if (!iqVar.Q || iqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.r2 r2Var : iqVar.getParentLayout().getFragmentStack()) {
            if (r2Var instanceof wb) {
                wb wbVar = (wb) r2Var;
                wbVar.W0();
                AndroidUtilities.runOnUIThread(new ne0(wbVar, user, chat, 29));
                return;
            }
        }
    }
}
