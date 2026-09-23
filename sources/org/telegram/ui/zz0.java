package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zz0 implements iq {
    public final /* synthetic */ ry a;
    public final /* synthetic */ a01 b;

    public zz0(a01 a01Var, ry ryVar) {
        this.b = a01Var;
        this.a = ryVar;
    }

    @Override // org.telegram.ui.iq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        a01 a01Var = this.b;
        a01Var.b.N1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = a01Var.b.getNotificationCenter();
        ProfileActivity profileActivity = a01Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        a01Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.iq
    public final void a(TLRPC.User user) {
    }
}
