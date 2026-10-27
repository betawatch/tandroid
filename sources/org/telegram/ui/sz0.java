package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sz0 implements fq {
    public final /* synthetic */ ey a;
    public final /* synthetic */ tz0 b;

    public sz0(tz0 tz0Var, ey eyVar) {
        this.b = tz0Var;
        this.a = eyVar;
    }

    @Override // org.telegram.ui.fq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        tz0 tz0Var = this.b;
        tz0Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = tz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = tz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        tz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.fq
    public final void a(TLRPC.User user) {
    }
}
