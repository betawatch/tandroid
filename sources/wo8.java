// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wo8 implements he2 {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ ke2 b;
    public final /* synthetic */ ProfileActivity c;

    public wo8(ProfileActivity profileActivity, TLRPC.Chat chat, ke2 ke2Var) {
        this.c = profileActivity;
        this.a = chat;
        this.b = ke2Var;
    }

    @Override // he2
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(user, profileActivity.F2.megagroup ? 10 : 9, -profileActivity.f1);
    }

    @Override // he2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
        if (W1 == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        ke2 ke2Var = this.b;
        if (!ke2Var.R || ke2Var.getParentLayout() == null) {
            return;
        }
        for (d dVar : ke2Var.getParentLayout().getFragmentStack()) {
            if (dVar instanceof vg1) {
                vg1 vg1Var = (vg1) dVar;
                vg1Var.Z0();
                gm.c3(new ak8((Object) vg1Var, (Object) W1, (Object) chat, (byte) 4));
                return;
            }
        }
    }
}
