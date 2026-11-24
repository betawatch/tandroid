// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rp8 implements he2 {
    public final /* synthetic */ nk3 a;
    public final /* synthetic */ sp8 b;

    public rp8(sp8 sp8Var, nk3 nk3Var) {
        this.b = sp8Var;
        this.a = nk3Var;
    }

    @Override // he2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        nm7 notificationCenter = profileActivity.getNotificationCenter();
        int i2 = nm7.s;
        notificationCenter.n(profileActivity, i2);
        profileActivity.getNotificationCenter().k(i2, new Object[0]);
    }

    @Override // he2
    public final void a(TLRPC.User user) {
    }
}
