package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uz0 implements iq {
    public final /* synthetic */ qy a;
    public final /* synthetic */ vz0 b;

    public uz0(vz0 vz0Var, qy qyVar) {
        this.b = vz0Var;
        this.a = qyVar;
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        vz0 vz0Var = this.b;
        vz0Var.b.K1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = vz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = vz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        vz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
    }
}
