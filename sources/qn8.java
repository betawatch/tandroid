// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qn8 implements wc2 {
    public final /* synthetic */ cj3 a;
    public final /* synthetic */ rn8 b;

    public qn8(rn8 rn8Var, cj3 cj3Var) {
        this.b = rn8Var;
        this.a = cj3Var;
    }

    @Override // wc2
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        kk7 notificationCenter = profileActivity.getNotificationCenter();
        int i2 = kk7.s;
        notificationCenter.n(profileActivity, i2);
        profileActivity.getNotificationCenter().k(i2, new Object[0]);
    }

    @Override // wc2
    public final void a(TLRPC.User user) {
    }
}
