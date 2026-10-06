package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class zz0 implements jq {
    public final /* synthetic */ uy a;
    public final /* synthetic */ a01 b;

    public zz0(a01 a01Var, uy uyVar) {
        this.b = a01Var;
        this.a = uyVar;
    }

    @Override // org.telegram.ui.jq
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

    @Override // org.telegram.ui.jq
    public final void a(TLRPC.User user) {
    }
}
