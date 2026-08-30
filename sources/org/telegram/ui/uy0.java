package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uy0 implements gq {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ jq b;
    public final /* synthetic */ ProfileActivity c;

    public uy0(ProfileActivity profileActivity, TLRPC.Chat chat, jq jqVar) {
        this.c = profileActivity;
        this.a = chat;
        this.b = jqVar;
    }

    @Override // org.telegram.ui.gq
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.J.m(-profileActivity.c1, user, profileActivity.B2.megagroup ? 10 : 9);
    }

    @Override // org.telegram.ui.gq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1));
        if (user == null || (chat = this.a) == null || profileActivity.b1 == 0) {
            return;
        }
        jq jqVar = this.b;
        if (!jqVar.N || jqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.p2 p2Var : jqVar.getParentLayout().getFragmentStack()) {
            if (p2Var instanceof sb) {
                sb sbVar = (sb) p2Var;
                sbVar.W0();
                AndroidUtilities.runOnUIThread(new hf0(sbVar, user, chat, 25));
                return;
            }
        }
    }
}
