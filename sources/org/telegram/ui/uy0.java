package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class uy0 implements aq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ dq b;
    public final /* synthetic */ ProfileActivity c;

    public uy0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
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
        if (!dqVar.R || dqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.o2 o2Var : dqVar.getParentLayout().getFragmentStack()) {
            if (o2Var instanceof vb) {
                vb vbVar = (vb) o2Var;
                vbVar.V0();
                AndroidUtilities.runOnUIThread(new re0(vbVar, user, chat, 27));
                return;
            }
        }
    }
}
