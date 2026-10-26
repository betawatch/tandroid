package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qz0 implements dq {
    public final /* synthetic */ cy a;
    public final /* synthetic */ rz0 b;

    public qz0(rz0 rz0Var, cy cyVar) {
        this.b = rz0Var;
        this.a = cyVar;
    }

    @Override // org.telegram.ui.dq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        rz0 rz0Var = this.b;
        rz0Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = rz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = rz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        rz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.dq
    public final void a(TLRPC.User user) {
    }
}
