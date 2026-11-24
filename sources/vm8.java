// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vm8 implements wc2 {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ zc2 b;
    public final /* synthetic */ ProfileActivity c;

    public vm8(ProfileActivity profileActivity, TLRPC.Chat chat, zc2 zc2Var) {
        this.c = profileActivity;
        this.a = chat;
        this.b = zc2Var;
    }

    @Override // wc2
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.c;
        profileActivity.M.m(user, profileActivity.F2.megagroup ? 10 : 9, -profileActivity.f1);
    }

    @Override // wc2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User V1 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1));
        if (V1 == null || (chat = this.a) == null || profileActivity.e1 == 0) {
            return;
        }
        zc2 zc2Var = this.b;
        if (!zc2Var.R || zc2Var.getParentLayout() == null) {
            return;
        }
        for (d dVar : zc2Var.getParentLayout().getFragmentStack()) {
            if (dVar instanceof nf1) {
                nf1 nf1Var = (nf1) dVar;
                nf1Var.Y0();
                gl.c3(new gm8(nf1Var, V1, chat, (byte) 1));
                return;
            }
        }
    }
}
