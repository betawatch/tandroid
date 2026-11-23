package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qv0 implements kp {
    public final /* synthetic */ cx a;
    public final /* synthetic */ rv0 b;

    public qv0(rv0 rv0Var, cx cxVar) {
        this.b = rv0Var;
        this.a = cxVar;
    }

    @Override // org.telegram.ui.kp
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.b.b;
        profileActivity.N1 = true;
        this.a.removeSelfFromStack();
        org.telegram.messenger.ls notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ls.t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override // org.telegram.ui.kp
    public final void a(TLRPC.User user) {
    }
}
