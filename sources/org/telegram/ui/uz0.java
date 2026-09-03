package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uz0 implements hq {
    public final /* synthetic */ py a;
    public final /* synthetic */ vz0 b;

    public uz0(vz0 vz0Var, py pyVar) {
        this.b = vz0Var;
        this.a = pyVar;
    }

    @Override // org.telegram.ui.hq
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

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
    }
}
