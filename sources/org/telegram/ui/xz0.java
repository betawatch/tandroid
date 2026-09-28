package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class xz0 implements hq {
    public final /* synthetic */ qy a;
    public final /* synthetic */ yz0 b;

    public xz0(yz0 yz0Var, qy qyVar) {
        this.b = yz0Var;
        this.a = qyVar;
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        yz0 yz0Var = this.b;
        yz0Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = yz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = yz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        yz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
    }
}
